import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Company comp = new Company("Şirket");

        boolean giris = true;

        while (giris){
            giris=menu();
            if (giris){
                comp.addEmployee();
            }
        }
    }

    public static boolean menu(){
        boolean secBool=false;
        Scanner inp = new Scanner(System.in);
        System.out.println("Çalışan maaş sorgusu : 1");
        System.out.println("Çıkış : 2");
        int soru = inp.nextInt();
        if (soru==1){
            secBool=true;

        }else if(soru==2){
            secBool=false;

        }else{
            System.out.println("Bilinmeyen karakter");
        }
        return secBool;
    }


}