package belajarjava;

public class main4 {
    public static void main(String[] args) {

        //operator aritmatika

        int variabel1 = 9;
        int variabel2 = 18;

        int hasil;

        //1. penjumlahan
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + "+" + variabel2 + "=" + hasil);

        //2. pengurangam
        hasil = variabel1 - variabel2;
        System.out.printf("%d - %d = %d \n",variabel1,variabel2,hasil);

        //3. perkalian
        hasil = variabel1 * variabel2;
        System.out.printf("%d * %d = %d \n",variabel1,variabel2,hasil);

        //4. pembagian
        hasil = variabel1 / variabel2;
        System.out.printf("%d / %d = %d \n",variabel1,variabel2,hasil);
        //casting pembagian
        int x = 40;
        int y = 50;
        float z = (float) x/y;
        System.out.println(z);

        float a = 6;
        float b = 8;
        float hasilfloat = a/b;
        System.out.println(a + "/" + b + "=" + hasilfloat);

        //5. modulus
        hasil = variabel1 % variabel2;
        System.out.printf("%d %% %d = %d \n",variabel1,variabel2,hasil);


    }
}
