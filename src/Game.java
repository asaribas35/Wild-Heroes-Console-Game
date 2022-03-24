public class Game {
    Player player;
    Location location;

    public Game(Player player,Location location) {
        this.player = player;
        this.location=location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    void start(){
        Toolstore ts = new Toolstore(player,"Tool Market");
        System.out.println("Welcome ");
        player.getInfo();

        setLocation(ts);

        ts.menu();



    }

}
