package belajarjava;

public class main6 {
    public static void main(String[] args) {

        //unary = operasi yang dilakukan pada satu variabel

        //unary + dan -
        //1. unary +
        int variabel2 = 9;
        System.out.printf("unary '+' %d menjadi %d\n",variabel2, +variabel2);

        //2. unary -
        int variabel1 = 6;
        System.out.printf("unary '-' %d menjadi %d\n",variabel1, -variabel1);


        //unary decrement dan increment
        //1. unary decrement
        int angka1 = 10;
        angka1++;
        System.out.println("nilai ++ menjadi = " + angka1);

        //2. unary increment
        int angka2 = 15;
        angka2--;
        System.out.println("nilai -- menjadi = " + angka2);


        int a = 5;
        System.out.printf("nilai dengan  '++' prefix menjadi = %d \n", ++a);
        int b = 8;
        System.out.printf("nilai dengan '--' postfix menjadi = %d \n", b++);
        System.out.printf("nilai dengan '--' postfix menjadi = %d \n", b);

        // unary bolean dengan ! untuk negasi
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);





    }

    }

