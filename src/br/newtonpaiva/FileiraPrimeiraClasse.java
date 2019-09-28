package br.newtonpaiva;

public class FileiraPrimeiraClasse {
    private String janelaEsquerda;
    private String corredorEsquerdo;

    private String corredorDireito;
    private String janelaDireita;

    public boolean adiciona(String passageiro,
                            int qtdPessoas,
                            String preferencia) {

        if (qtdPessoas == 2 && janelaEsquerda == null &&
                corredorEsquerdo == null) {
            janelaEsquerda = corredorEsquerdo = passageiro;
            return true;
        } else if (qtdPessoas == 1 && preferencia.equals("J") &&
                janelaEsquerda == null) {
            janelaEsquerda = passageiro;
            return true;
        }

        if (qtdPessoas == 2 && janelaDireita == null &&
                corredorDireito == null) {
            janelaDireita = corredorDireito = passageiro;
            return true;
        } else if (qtdPessoas == 1 && preferencia.equals("J") &&
                janelaDireita == null) {
            janelaDireita = passageiro;
            return true;
        }
        return false;
    }

    public String getPoltrona(int num) {
        switch (num) {
            case 0:
                return janelaEsquerda;
            case 1:
                return corredorEsquerdo;
            case 2:
                return corredorDireito;
            case 3:
                return janelaDireita;
            default:
                return "Inválido";
        }
    }
}
