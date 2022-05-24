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
        Weapons Mızrak = new Weapons("Mızrak",4,5,40);
        weaponsList.add(Mızrak);
        menuprint(weaponsList);
        buy(weaponsList);
    }
    void buy(ArrayList<Weapons> w){
        Scanner inp = new Scanner(System.in);
        int c = inp.nextInt();
        buychoose(c,w);
        

    }
    void menuprint(ArrayList<Weapons> w){
        System.out.println(getPlayer());
        for(int i=0;i<w.size();i++){
            System.out.println((i+1)+". "+w.get(i).getName()+" - Hasar : "+ w.get(i).getDamage()+" - Fiyat : "+ w.get(i).getCost());
        }
        System.out.println((w.size()+1)+" Exit");
    }

    void buychoose(int c,ArrayList<Weapons> w){
        if (c>0 && c<=w.size()){
            if (getPlayer().getMoney()>=w.get(c-1).getCost()){
                System.out.println(w.get(c-1).getName() +"aldın");
                getPlayer().setMoney(getPlayer().getMoney()-w.get(c-1).getCost());
                getPlayer().setDamage(getPlayer().getDamage()+w.get(c-1).getDamage());
                getPlayer().getInventory().setWeaponDamage(w.get(c-1).getDamage());
                getPlayer().getInventory().setWeaponName(w.get(c-1).getName());

            }else {
                System.out.println("Para yetersiz");
            }
            menu();

        } else if (c==(w.size())+1){

        }else {
            System.out.println("hatalı giriş");
            menu();
        }

    }



}
