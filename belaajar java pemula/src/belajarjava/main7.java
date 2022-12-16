package belajarjava;

public class main7 {
    public static void main(String[] args) {

        // operator assigment
        //tanda '=' adalah assigment

        int a = 5;

        //cara sulit
        a = a + 4;
        a = a + 10;

        System.out.println("nilai a = " + a);

        //cara mudah
        //assigment operator penjumlahan
        int b = 4;
        b += 45; //a = a + 45
        System.out.println("nilai b = " + b);

        //assigment operator pengurangan
        int c = 20;
        c -= 5;
        System.out.println("nilai c = " + c);

        //assigment operator perkalian
        int d = 2;
        d *= 7;
        System.out.println("nilai d = " + d);

        //assigment operator pembagian
        int e = 50;
        e /= 10;
        System.out.println("nilai e = " + e);

        //assigment operator modulus
        int f = 40;
        f %= 5;
        System.out.println("nilai f = " + f);
    }
}
