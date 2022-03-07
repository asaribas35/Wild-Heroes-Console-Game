import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class Main {
    /**
     * @author ali sarıbaş
     *
     */
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int r,a;
    double pi = 3.14;
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = inp.nextInt();
        System.out.print("Alfa merkez açısını giriniz: ");
        a= inp.nextInt();

        System.out.println("Daire diliminin alanı: " + (pi*(r*r)*a/360) );
    }
}
