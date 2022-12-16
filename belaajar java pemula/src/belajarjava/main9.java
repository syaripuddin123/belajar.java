package belajarjava;

public class main9 {
    public static void main(String[] args) {

        //operator bitwise -----> operator untuk melakukan operrasi pada nilai bit

        byte a = 5;
        byte b, c;
        String a_bits,b_bits,c_bits;


        //operator SIFT LEFT
        System.out.println("=====SIFT LEFT======");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a << 3);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

        //operator SIFT RIGHT
        System.out.println("=====SIFT RIGHT======");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a << 2);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);

        //operator BITWISE OR
        System.out.println("=====BITWISE OR======");
        a = 20;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 32;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("------OR--------");
        c = (byte)(a|b);
        c_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n",c_bits, c);




    }


}
