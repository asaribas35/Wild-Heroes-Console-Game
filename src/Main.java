import java.util.Scanner;


public class Main {
    /**
     * @author ali sarıbaş
     *
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double kdv;

        System.out.print("Ürünün fiyatını giriniz: ");
        int fiyat = inp.nextInt();

        if (fiyat<=1000 && fiyat>=0){
            kdv = 0.18;
        }else {
            kdv = 0.08;
        }

        System.out.println("kdv'siz fiyat : " +fiyat);
        System.out.println("kdv'li fiyat : " + (fiyat+fiyat*kdv));
        System.out.println("kdv tutarı : " + (fiyat*kdv));





    }
}
