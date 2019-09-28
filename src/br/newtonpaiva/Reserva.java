package br.newtonpaiva;

public class Reserva {
    private FileiraPrimeiraClasse primeiraClasse[];
    private String classeEconomica[][];

    public enum Preferencia {
        JANELA, CORREDOR
    }

    public Reserva() {
        this.primeiraClasse = new FileiraPrimeiraClasse[5];
        this.classeEconomica = new String[30][3];
    }

    public boolean adicionarPassageiros(String passageiro,
                                        boolean primeiraClasse,
                                        boolean classeEconomica,
                                        int qtdPassageiros,
                                        String preferencia) {

        if (primeiraClasse) {
            if (qtdPassageiros < 1 || qtdPassageiros > 2)
                throw new IllegalArgumentException("Qtd inválida para primeira classe");

            if (!preferencia.equals("J") && !preferencia.equals("C"))
                throw new IllegalArgumentException("Preferencia inválida para primeira classe");


            for (int i = 0; i < this.primeiraClasse.length; i++) {

                if (this.primeiraClasse[i] == null)
                    this.primeiraClasse[i] = new FileiraPrimeiraClasse();

                if (this.primeiraClasse[i].adiciona(passageiro, qtdPassageiros, preferencia)) {
                }

            }

        } else {

            if (classeEconomica) {
                if (qtdPassageiros < 1 || qtdPassageiros > 3)
                    throw new IllegalArgumentException("Qtd inválida para classe economica");

                if (!preferencia.equals("J") && !preferencia.equals("C"))
                    throw new IllegalArgumentException("Preferencia inválida para classe economica");


                for (int i = 0; i < this.classeEconomica.length; i++) {

                    if (this.classeEconomica[i] == null)
                        this.classeEconomica[i] = new String[0];


                }

            }
        }

        return false;
    }

    public String mostrarPoltrona(boolean primeiraClasse, int fileira, int poltrona) {
        if (primeiraClasse) {
            FileiraPrimeiraClasse f = this.primeiraClasse[fileira - 1];
            return f.getPoltrona(poltrona - 1);
        } else {

        }

        return null;

    }
}
