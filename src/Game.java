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
        Main.clearScreen();
        SafeHouse sh = new SafeHouse(player,"Base");
        Toolstore ts = new Toolstore(player,"Tool Market");
        BattleLoc bl = new BattleLoc(player,"Battle Loc");


        setLocation(sh);
        Scanner inp = new Scanner(System.in);

        System.out.print("Welcome " + player.getName());

        System.out.println(" You are on " + location.getName());
        System.out.println("1. Go Battle Area ");
        System.out.println("2. Go Market  ");
        System.out.println("3. Char Info");
        System.out.println("4. Go Safe Area ");
        System.out.println("5. Exit Game");
        int c = inp.nextInt();

        switch (c){
            case 1:
                setLocation(bl);
                bl.start();
                start();
                break;

            case 2:
                setLocation(ts);
                ts.menu();
                start();
                break;

            case 3:
                player.getInfo();
                start();
                break;
            case 4:
                sh.onLocation();
                start();
                break;
            case 5:
                break;
            default:
                break;

        }
        inp.close();

    }

    void createMonsters(){

    }

}
