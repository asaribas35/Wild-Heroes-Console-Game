import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private Character character;
    private int damage = 1;
    private int healty = 1;
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
        System.out.println("Character no : " + getCharacter().getId());
        System.out.println("-----------------------Inventory---------------------------");
        System.out.println("weapon name : " + getInventory().getWeaponName());
        System.out.println("weapon damage : " + getInventory().getWeaponDamage());
        System.out.println("armor defence : " + getInventory().getArmorDefence());
        System.out.println("water : " + getInventory().isWater());
        System.out.println("food : " + getInventory().isFood());
        System.out.println("firewood : " + getInventory().isFirewoord());
        System.out.println("press any key for exit . ");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory setInventory(){
        Inventory inv = new Inventory(true,true,true,"weapon",10,5);
        return inv;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
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
        Scanner s = new Scanner(System.in);
        Character samurai = new Character(1,5,21,15);
        Character bow = new Character(2,7,18,20);
        Character  knight = new Character(3,8,24,5);

        System.out.println("---Select Character---");
        System.out.println("1. Samurai (Damage:5 Health:21 Cost:15 )");
        System.out.println("2. Bow (Damage:7 Health:18 Cost:20 )");
        System.out.println("3. Knight (Damage:8 Health:24 Cost:5 )");
        int c = s.nextInt();

        switch (c){
            case 1:
                if (getMoney()>= samurai.getMoney()){
                    setDamage(samurai.getDamage());
                    setHealty(samurai.getHealth());
                    setMoney(getMoney()- samurai.getMoney());
                    setCharacter(samurai);
                    System.out.println("Samuray seçildi");
                }else {
                    System.out.println("para yetersiz");
                }

                break;
            case 2:
                if (getMoney()>= bow.getMoney()){
                    setDamage(bow.getDamage());
                    setHealty(bow.getHealth());
                    setMoney(getMoney()- bow.getMoney());
                    setCharacter(bow);
                    System.out.println("Bow seçildi");
                }else {
                    System.out.println("para yetersiz");
                }
                break;
            case 3:
                if (getMoney()>= knight.getMoney()){
                    setDamage(knight.getDamage());
                    setHealty(knight.getHealth());
                    setMoney(getMoney()- knight.getMoney());
                    setCharacter(knight);
                    System.out.println("Knight seçildi");
                }else {
                    System.out.println("para yetersiz");
                }
                break;
            case 4:
                break;
            default:
                break;
        }


    }


}
