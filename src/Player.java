public class Player {
    private Inventory inventory;
    private int damage = 10;
    private int healty = 100;
    private int money = 50;
    private String name;

    public Player(String name) {

        this.name = name;
        this.inventory= setInventory();

    }

    public Inventory getInventory() {
        return inventory;
    }

    public void getInfo(){
        System.out.println("oyuncu adı : " + getName());
        System.out.println("oyuncu can : " + getHealty());
        System.out.println("oyuncu hasar : " + getDamage());
        System.out.println("para : " + getMoney());
        System.out.println("-----------------------Inventory---------------------------");
        System.out.println("weapon name : " + getInventory().getWeaponName());
        System.out.println("weapon damage : " + getInventory().getWeaponDamage());
        System.out.println("armor defence : " + getInventory().getArmorDefence());
        System.out.println("water : " + getInventory().isWater());
        System.out.println("food : " + getInventory().isFood());
        System.out.println("firewood : " + getInventory().isFirewoord());
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory setInventory(){
        Inventory inv = new Inventory(true,true,true,"weapon",10,5);
        return inv;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void selectChar(){
        System.out.println("karakter secim ekranı!!!");
    }


}
