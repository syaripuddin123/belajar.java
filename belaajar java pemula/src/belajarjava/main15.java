package belajarjava;

public class main15 {
    public static void main(String[] args) {

        //nested if atau if bersarang

        int a = 5;
        int b = 7;

        System.out.println("ini adalah awal program");

        if (a == 9) {

            if (b == 10) {

                System.out.println("ini adalah di mana a = 5 dan b =10");

            }else {

                System.out.println("ini adalah di mana a = 5 dan b bukan 10");
            }

        }else {

            System.out.println("ini adalah di mana a dan b salah");

        }

        System.out.println("ini adalah akhir dari program");
    }
}
