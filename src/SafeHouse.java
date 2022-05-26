public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player,String name){
        super(player,name);
    }

    @Override
    boolean onLocation() {
        getPlayer().setHealty(100);
        return true;
    }
}
