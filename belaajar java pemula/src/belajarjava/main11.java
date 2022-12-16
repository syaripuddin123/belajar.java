package belajarjava;

import java.util.Scanner;

public class main11 {
    public static void main(String[] args) {

        //pengelompokan operasi aritmatika

        int hasil = 5 * 5 - 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 3;
        System.out.println(hasil);
        
        //pengelompokan operasi aritmatika menggunakan ()
        hasil = 5 + (10 / 2);
        System.out.println(hasil);

        //perhitungan persamaan kuadrat
        System.out.println("PERSAMAAN KUADRAT");

        Scanner user_input = new Scanner(System.in);
        int a,x,c;
        System.out.print("nila a = ");
        a = user_input.nextInt();
        System.out.print("gradient x = ");
        x = user_input.nextInt();
        System.out.print("bias c = ");
        c = user_input.nextInt();

        int y = a * x + c;
        System.out.println("hasil = " + y);



    }
}
