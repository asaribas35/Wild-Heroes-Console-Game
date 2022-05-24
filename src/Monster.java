public class Monster {
    private String name;
    private int damage;
    private int healty;
    private int gold;

    public Monster(String name,int damage, int healty,int gold){
        this.name=name;
        this.damage=damage;
        this.healty=healty;
        this.gold=gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
