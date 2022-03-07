import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class Main {
    /**
     * @author ali sarıbaş
     *
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a ,b ,c, u;
        System.out.print("Üçgenin 1. kenarını giriniz: ");
        a = inp.nextInt();
        System.out.print("Üçgenin 2. kenarını giriniz: ");
        b = inp.nextInt();
        System.out.print("Üçgenin 3. kenarını giriniz: ");
        c = inp.nextInt();



        u = (a+b+c)/2;



        System.out.println("Üçgenin çevresi: " + (2*u));

        System.out.println("Üçgenin alanı: " + (int)Math.sqrt(u*(u-a)*(u-b)*(u-c)) );




    }
}
