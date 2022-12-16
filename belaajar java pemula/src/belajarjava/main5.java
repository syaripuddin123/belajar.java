package belajarjava;

public class main5 {
    public static void main(String[] args) {

        //konversi tipe data numerik
        //1. mengkonversi tipe data ke yang lebih besar
        byte inibyte = 5;
        int iniinteger = inibyte;
        System.out.println("nilai integer = " + iniinteger);

        long inilong = iniinteger;
        System.out.println("nilai short = " + inilong);

        //2. mengkonversi tipe data besar ke tipe data terkecil

        long inilong1 = 450;
        /*
        byte inibyte1 = inilong1;
        System.out.println(inibyte1);
        */
        byte inibyte1 = (byte) inilong1;
        System.out.println(inibyte1);




    }
}
