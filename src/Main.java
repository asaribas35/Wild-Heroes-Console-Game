import java.util.Scanner;


public class Main {
    /**
     * @author ali sarıbaş
     *
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat, alg, tar, oop, ugi;
        System.out.print("matematik dersinin notunu giriniz: ");
        mat = inp.nextInt();

        System.out.print("algoritma dersinin notunu giriniz: ");
        alg = inp.nextInt();

        System.out.print("tarih dersinin notunu giriniz: ");
        tar = inp.nextInt();

        System.out.print("oop dersinin notunu giriniz: ");
        oop = inp.nextInt();

        System.out.print("Üniversiteye giriş dersinin notunu giriniz: ");
        ugi = inp.nextInt();

        int ort = ((mat+alg+tar+oop+ugi)/5);

        boolean bool = (ort>=60);


        System.out.println("ortalamanız : " + ort);
        System.out.println(bool ? "tebrikler sınıfı geçtiniz":"maalesef sınıfı geçemediniz");




    }
}
