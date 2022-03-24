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
        System.out.println("1. Ok-Yay : 20 ");
        System.out.println("2. Kadim Kılıç : 30 ");
        System.out.println("3. Mızrak : 35 ");
        System.out.println("4. Çıkış ");

    }
    void buy(){
        System.out.println("aldın");
    }
}
