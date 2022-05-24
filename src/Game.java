import java.util.Scanner;

public class Game {
    Player player;
    Location location;

    public Game(Player player) {
        this.player = player;

    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    void start(){
        SafeHouse sh = new SafeHouse(player,"Base");
        Toolstore ts = new Toolstore(player,"Tool Market");
        BattleLoc bl = new BattleLoc(player,"Battle Loc");


        setLocation(sh);
        Scanner inp = new Scanner(System.in);

        System.out.print("Welcome " + player.getName());

        System.out.println(" You are on " + location.getName());
        System.out.println("1. Go Market ");
        System.out.println("2. Char Info ");
        System.out.println("3. Go Battle Area");
        System.out.println("4. Exit Game ");
        int c = inp.nextInt();

        switch (c){
            case 1:
                setLocation(ts);
                ts.menu();
                start();
                break;
            case  2:
                player.getInfo();
                start();
                break;
            case 3:
                setLocation(bl);
                bl.menu();
                start();
                break;
            default:
                break;

        }
        inp.close();

    }

    void createMonsters(){

    }

}
