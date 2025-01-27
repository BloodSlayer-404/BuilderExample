package org.example.equipment;

public class Weapon {
    private String weaponName;
    private double damage;
    private int durability;

    public Weapon(){

    }

    public Weapon(String weaponName, double damage, int durability) {
        this.weaponName = weaponName;
        this.damage = damage;
        this.durability = durability;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponName='" + weaponName + '\'' +
                ", damage=" + damage +
                ", durability=" + durability +
                '}';
    }
}
