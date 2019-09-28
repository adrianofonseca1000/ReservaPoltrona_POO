package br.newtonpaiva;

public class FileiraClasseEconomica {
    private String janelaEsquerda;
    private String poltronaMeioEsquerda;
    private String corredorEsquerdo;

    private String corredorDireito;
    private String poltronaMeioDireita;
    private String janelaDireita;

    public boolean adiciona(String passageiro,
                            int qtdPessoas,
                            String preferencia) {

        if (qtdPessoas == 3 && janelaEsquerda == null &&
                poltronaMeioEsquerda == null &&
                corredorEsquerdo == null) {
            janelaEsquerda = poltronaMeioEsquerda = corredorEsquerdo = passageiro;
            return true;
        } else if (qtdPessoas == 1 && preferencia.equals("J") &&
                janelaEsquerda == null) {
            janelaEsquerda = passageiro;
            return true;
        } else if (qtdPessoas == 2 && preferencia.equals("PM") &&
                poltronaMeioEsquerda == null) {
            poltronaMeioEsquerda = passageiro;
            return true;
        } else if (qtdPessoas == 3 && preferencia.equals("CE") &&
                corredorEsquerdo == null) {
            corredorEsquerdo = passageiro;
            return true;
        }

        if (qtdPessoas == 3 && janelaDireita == null &&
                poltronaMeioDireita == null &&
                corredorDireito == null) {
            janelaDireita = poltronaMeioDireita = corredorDireito = passageiro;
            return true;
        } else if (qtdPessoas == 1 && preferencia.equals("J") &&
                janelaDireita == null) {
            janelaDireita = passageiro;
            return true;
        } else if (qtdPessoas == 2 && preferencia.equals("PM") &&
                poltronaMeioDireita == null) {
            poltronaMeioDireita = passageiro;
            return true;
        } else if (qtdPessoas == 3 && preferencia.equals("CE") &&
                corredorDireito == null) {
            corredorDireito = passageiro;
            return true;
        }
        return false;
    }

    public String getPoltrona(int num) {
        switch (num) {
            case 0:
                return janelaEsquerda;
            case 1:
                return poltronaMeioEsquerda;
            case 2:
                return corredorEsquerdo;
            case 3:
                return corredorDireito;
            case 4:
                return poltronaMeioDireita;
            case 5:
                return janelaDireita;
            default:
                return "Inválido";
        }
    }
}
