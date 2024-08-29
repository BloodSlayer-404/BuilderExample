package org.example.equipment;

public class Armor {
    private String armorName;
    private double protectionPoints;
    private int durability;

    public Armor() {
    }

    public Armor(String armorName, double protectionPoints, int durability) {
        this.armorName = armorName;
        this.protectionPoints = protectionPoints;
        this.durability = durability;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public double getProtectionPoints() {
        return protectionPoints;
    }

    public void setProtectionPoints(double protectionPoints) {
        this.protectionPoints = protectionPoints;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "armorName='" + armorName + '\'' +
                ", protectionPoints=" + protectionPoints +
                ", durability=" + durability +
                '}';
    }
}
