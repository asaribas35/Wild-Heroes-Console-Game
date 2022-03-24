import java.util.Scanner;

public class Toolstore extends NormalLoc{
    public Toolstore(Player player,String name){
        super(player,name);
    }

    @Override
    boolean onLocation() {
        return true;
    }
    void menu(){
        System.out.println(super.getName()+"a Hoşgeldiniz ---------------------------");
        System.out.println("bakiye: " + getPlayer().getMoney());
        System.out.println("1. Ok-Yay : 20 ");
        System.out.println("2. Kadim Kılıç : 30 ");
        System.out.println("3. Mızrak : 35 ");
        System.out.println("4. Çıkış ");
        buy();
    }
    void buy(){
        Scanner inp = new Scanner(System.in);
        int c = inp.nextInt();
        switch (c){
            case 1:
                if (getPlayer().getMoney()>=20){
                    System.out.println("Ok-Yay aldın");
                    getPlayer().setMoney(getPlayer().getMoney()-20);
                }else {
                    System.out.println("Para yetersiz");
                }
                menu();
            case 2:
                if (getPlayer().getMoney()>=30){
                    System.out.println("Kadim Kılıç aldın");
                    getPlayer().setMoney(getPlayer().getMoney()-30);
                }else {
                    System.out.println("Para yetersiz");
                }
                menu();
            case 3:
                if (getPlayer().getMoney()>=35){
                    System.out.println("Mızrak aldın");
                    getPlayer().setMoney(getPlayer().getMoney()-35);
                }else {
                    System.out.println("Para yetersiz");
                }
                menu();
            case 4:
                break;
            default:
                System.out.println("hata");
                break;

        }
    }
}
