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
        setLocation(sh);
        Scanner inp = new Scanner(System.in);
        Toolstore ts = new Toolstore(player,"Tool Market");
        System.out.println("Welcome " + player.getName());
        System.out.println("You are on " + location.getName());
        System.out.println("1. Go Market ");
        System.out.println("2. Char Info ");
        System.out.println("3. Exit Game ");
        int c = inp.nextInt();

        switch (c){
            case 1:
                setLocation(ts);
                ts.menu();
                start();
            case  2:
                player.getInfo();
                start();
            case 3:
                break;
            default:
                break;

        }


        //player.getInfo();

        //setLocation(ts);

        //ts.menu();



    }

}
