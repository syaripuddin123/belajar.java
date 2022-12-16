package belajarjava;

public class main8 {
    public static void main(String[] args) {

        //operator logika ----->operasi yang bisa kita lakukan kepada tipe data boolean
        //AND, OR, XOR, negasi

        boolean a, b, c;

        //OR / atau (||)
        System.out.println("======= OR (||) ======");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        //AND / atau (==)
        System.out.println("======= AND (==) ======");
        a = false;
        b = false;
        c = (a==b);
        System.out.println(a + " == " + b + " = " + c);
        a = true;
        b = false;
        c = (a==b);
        System.out.println(a + " == " + b + " = " + c);
        a = false;
        b = true;
        c = (a==b);
        System.out.println(a + " == " + b + " = " + c);
        a = true;
        b = true;
        c = (a==b);
        System.out.println(a + " == " + b + " = " + c);

        //XOR / atau (^)
        System.out.println("======= XOR (^) ======");
        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);
        
        //NOT / NEGASI -----> FLIPING
        a = true;
        c = !a;
        System.out.println(a + " -------> (!) " + c);
        b = false;
        c = !b;
        System.out.println(a + " --------> (!) " +  c);







    }
}
