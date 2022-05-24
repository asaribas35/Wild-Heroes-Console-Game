import java.util.ArrayList;

public class BattleLoc extends Location{

    private Monster monster;


    public BattleLoc(Player player, String name) {
        super(player, name);

    }
    public BattleLoc(Player player, String name,Monster monster) {
        super(player, name);
        this.monster=monster;

    }


    void menu(){

        ArrayList<BattleLoc> battleLocArrayList = new ArrayList<BattleLoc>();

        Monster movia = new Monster("Movia",1,10,5);
        Monster graesp = new Monster("Graesp",2,12,7);
        Monster edenp = new Monster("Edenp",3,14,10);
        Monster baroiWolf = new Monster("BaroiWolf",4,16,14);
        Monster kiklopes = new Monster("Kiklopes",5,17,19);

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

        System.out.println(getPlayer().getName() + " Welcome Battle Area");

        for(int i=0;i<battleLocArrayList.size();i++){
            System.out.println(battleLocArrayList.get(i).getName());
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
