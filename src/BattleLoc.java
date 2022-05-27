import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class BattleLoc extends Location{

    private Monster monster;


    public BattleLoc(Player player, String name) {
        super(player, name);

    }
    public BattleLoc(Player player, String name,Monster monster) {
        super(player, name);
        this.monster=monster;

    }


    void start(){
        Main.clearScreen();
        ArrayList<BattleLoc> battleLocArrayList = new ArrayList<BattleLoc>();

        Monster movia = new Monster("Movia",5,20,5);
        Monster graesp = new Monster("Graesp",11,32,7);
        Monster edenp = new Monster("Edenp",23,44,10);
        Monster baroiWolf = new Monster("BaroiWolf",25,50,14);
        Monster kiklopes = new Monster("Kiklopes",30,60,19);

        BattleLoc rift = new BattleLoc(getPlayer(),"rift",movia);
        battleLocArrayList.add(rift);
        BattleLoc river = new BattleLoc(getPlayer(),"river",graesp);
        battleLocArrayList.add(river);
        BattleLoc cave = new BattleLoc(getPlayer(),"cave",edenp);
        battleLocArrayList.add(cave);
        BattleLoc sand = new BattleLoc(getPlayer(),"sand",baroiWolf);
        battleLocArrayList.add(sand);
        BattleLoc north = new BattleLoc(getPlayer(),"north",kiklopes);
        battleLocArrayList.add(north);

        menuPrint(battleLocArrayList);


    }
    void menuPrint(ArrayList<BattleLoc> bl){
        System.out.println(" Welcome "+ getPlayer().getName()+ " Battle Area");
        System.out.println("-----------------Select Battle Area-----------------------");
        for(int i=0;i<bl.size();i++){
            System.out.println(i+1 +" . " + bl.get(i).getName() + " - (Level "+(i+1)+")");
        }
        System.out.println((bl.size()+1)+" . Exit" );
        choice(bl);
    }

    void choice(ArrayList<BattleLoc> bl){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(c);
        if(c>0 && c<= bl.size()){
            System.out.println("git");
            battle(bl.get(c-1));
        }else if (c> bl.size()+1 || c<=0){
            System.out.println("hatalı giriş");
            menuPrint(bl);
        }


    }
    void battle(BattleLoc bl){
        System.out.println("--------------- "+bl.getName()+" 'e giriş yapıldı.----------------");
        System.out.println("Karşındaki canavar = "+ bl.getMonster().getName()+" (Damage: "+bl.getMonster().getDamage()+" - HP: "+bl.getMonster().getHealty()+" )");
        System.out.println("Seçimini yap:");
        System.out.println("1. Savaş ");
        System.out.println("2. Kaç ");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b==1){
            fight(bl.getMonster());
        }else if (b==2){
            System.out.println("Savaş alanını terk ettin");
        }else {
            System.out.println("Hatalı Giriş");
            battle(bl);
        }


    }
    void fight(Monster monster){
        System.out.println(getPlayer().getName()+"  XXXXXXXXFIGHTXXXXXXXXX  "+monster.getName());

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("HP: "+getPlayer().getHealty()+"    --------------   HP:  "+monster.getHealty());

                getPlayer().setHealty( getPlayer().getHealty()-monster.getDamage() );
                monster.setHealty( monster.getHealty()-getPlayer().getDamage() );
                if (monster.getHealty()<=0 || getPlayer().getHealty()<=0){
                    cancel();
                }
                if (monster.getHealty()<=0){
                    System.out.println("----WIN------");
                    System.out.println(monster.getGold()+" altın kazandın");
                    getPlayer().setMoney(getPlayer().getMoney()+monster.getGold());
                    System.out.println("1. Savaşa Devam Et!!");
                    System.out.println("2. Çık.");
                }
                if (getPlayer().getHealty()<=0){
                    System.out.println("------LOSE-------");
                    System.out.println("1. Savaşa Devam Et!!");
                    System.out.println("2. Çık.");
                }

            }
        };
        timer.schedule(task,0,2000);

        Scanner in = new Scanner(System.in);
        int f = in.nextInt();



        if (f==1){
            start();
        }else if (f==2){
            System.out.println("cıkış yaptın");
        }else{
            System.out.println("hata");

        }

    }


    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    @Override
    boolean onLocation() {
        return true;
    }
}
