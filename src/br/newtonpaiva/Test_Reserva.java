package br.newtonpaiva;

import sun.font.TrueTypeFont;

public class Test_Reserva {
    public static void main(String[] args) {
        Reserva r = new Reserva();
        System.out.println(r);

        try {
            Reserva rerro = new Reserva();
        } catch (IllegalArgumentException e) {
            System.out.println("1° Classe:" + e.getMessage());
        }

        try {
            Reserva rerro = new Reserva();
        } catch (IllegalArgumentException e) {
            System.out.println("Classe não existe:" + e.getMessage());
        }
    }
}
