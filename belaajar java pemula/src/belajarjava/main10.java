package belajarjava;

import java.util.Scanner;

public class main10 {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        // mengambil user input (Scanner)
        System.out.println("=====MENGHITUNG LUAS=====");
        System.out.print("panjang = ");
        panjang = user_input.nextInt();
        System.out.print("lebar = ");
        lebar = user_input.nextInt();

        luas = panjang * lebar;
        System.out.println("luas = " + luas);

        System.out.println("=====MENGHITUNG VOLUME=====");
        System.out.print("tinggi = ");
        tinggi = user_input.nextInt();
        volume = luas * tinggi;
        System.out.print("volume = " +volume);

    }

}


