import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class Main {
    /**
     * @author ali sarıbaş
     *
     */
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int kilo;
    double boy;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = inp.nextInt();
        System.out.println("Vücut kitle endeksiniz: " + (kilo/(boy*boy) ) );
    }
}
