package belajarjava;

import java.util.Scanner;

public class main12 {
    public static void main(String[] args) {

        //latihan operator logika

        Scanner user_input = new Scanner(System.in);

        //msebuah program sederhana untuk menebak angka
        int nilai_benar = 10;
        int nilai_tebakan;
        boolean status_tebakan;

        System.out.print("masukkan nilai tebakan anda = ");
        nilai_tebakan = user_input.nextInt();
        System.out.println("nilai tebakan anda adalah = " + nilai_tebakan);

        //operasi logika
        status_tebakan = (nilai_tebakan == nilai_benar);
        System.out.println("nilai tebakan anda = " + status_tebakan);

        //operasi aljabar boolean
        System.out.print("masukkan nilai di antara 4 dan 7 = ");
        nilai_tebakan = user_input.nextInt();
        status_tebakan = (nilai_tebakan > 4) && (nilai_tebakan < 9);
        System.out.println("nilai tebakan anda = " + status_tebakan);





    }
}
