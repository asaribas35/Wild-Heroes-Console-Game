public class Inventory {
    private boolean water;
    private boolean food ;
    private boolean firewoord;
    private String weaponName;
    private int weaponDamage;
    private int armorDefence;

    public Inventory(boolean water, boolean food, boolean firewoord, String weaponName, int weaponDamage, int armorDefence) {
        this.water = water;
        this.food = food;
        this.firewoord = firewoord;
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.armorDefence = armorDefence;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewoord() {
        return firewoord;
    }

    public void setFirewoord(boolean firewoord) {
        this.firewoord = firewoord;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorDefence() {
        return armorDefence;
    }

    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }
}
