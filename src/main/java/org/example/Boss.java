package org.example;

import org.example.equipment.Ability;
import org.example.equipment.Armor;
import org.example.equipment.Weapon;

import java.util.List;

public class Boss {
    private final String name;
    private final double healthPoints;
    private final Weapon weapon;
    private final Armor armor;
    private final List<Ability> abilities;

    public Boss(String name, double healthPoints, Weapon weapon, Armor armor, List<Ability> abilities) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
        this.armor = armor;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "\n name='" + name + '\'' +
                "\n healthPoints=" + healthPoints +
                "\n weapon=" + weapon +
                "\n armor=" + armor +
                "\n abilities=" + abilities +
                '}';
    }
}
