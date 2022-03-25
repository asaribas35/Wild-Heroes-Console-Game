import java.util.Scanner;
import java.util.ArrayList;

public class Toolstore extends NormalLoc{
    public Toolstore(Player player,String name){
        super(player,name);
    }

    @Override
    boolean onLocation() {
        return true;
    }
    void menu(){
        ArrayList<Weapons> weaponsList = new ArrayList<Weapons>();
        System.out.println(super.getName()+"a Hoşgeldiniz ---------------------------");
        System.out.println("bakiye: " + getPlayer().getMoney());
        Weapons Tabanca = new Weapons("Tabanca",1,2,25);
        weaponsList.add(Tabanca);
        Weapons Kılıç = new Weapons("Kılıç",2,3,35);
        weaponsList.add(Kılıç);
        Weapons Tüfek = new Weapons("Tüfek",3,7,45);
        weaponsList.add(Tüfek);
        menuprint(weaponsList);
      //  System.out.println(Tabanca.getId()+". Tabanca : Damage : " +Tabanca.getDamage()+" : Cost : "+ Tabanca.getCost());
      //  System.out.println(Kılıç.getId()+". Kılıç : Damage : " +Kılıç.getDamage()+" : Cost : "+ Kılıç.getCost());
      //  System.out.println(Tüfek.getId()+". Tüfek : Damage : " +Tüfek.getDamage()+" : Cost : "+ Tüfek.getCost());
      //  System.out.println("4. Çıkış ");
        buy(weaponsList);
    }
    void buy(ArrayList<Weapons> w){
        Scanner inp = new Scanner(System.in);
        int c = inp.nextInt();
        switch (c){
            case 1:
                if (getPlayer().getMoney()>=w.get(c-1).getCost()){
                    System.out.println(w.get(c-1).getName() +"aldın");
                    getPlayer().setMoney(getPlayer().getMoney()-w.get(c-1).getCost());
                }else {
                    System.out.println("Para yetersiz");
                }
                menu();
                break;
            case 2:
                if (getPlayer().getMoney()>=w.get(c-1).getCost()){
                    System.out.println(w.get(c-1).getName()+" aldın");
                    getPlayer().setMoney(getPlayer().getMoney()-w.get(c-1).getCost());
                }else {
                    System.out.println("Para yetersiz!");
                }
                menu();
                break;
            case 3:
                if (getPlayer().getMoney()>=w.get(c-1).getCost()){
                    System.out.println(w.get(c-1).getName()+" aldın");
                    getPlayer().setMoney(getPlayer().getMoney()-w.get(c-1).getCost());
                }else {
                    System.out.println("Para yetersiz!!");
                }
                menu();
                break;
            case 4:
                System.out.println("exit");
                break;

                default:
                break;


        }
    }
    void menuprint(ArrayList<Weapons> w){
        for(int i=0;i<w.size();i++){
            System.out.println((i+1)+". "+w.get(i).getName()+" - Hasar : "+ w.get(i).getDamage()+" - Fiyat : "+ w.get(i).getCost());
        }
        System.out.println("4. Exit");
    }
}
