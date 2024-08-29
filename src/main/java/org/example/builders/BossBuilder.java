package org.example.builders;

import org.example.Boss;
import org.example.equipment.Ability;
import org.example.equipment.Armor;
import org.example.equipment.Weapon;

import java.util.List;

public class BossBuilder implements Builder{

    private String name;
    private double healthPoints;
    private Weapon weapon;
    private Armor armor;
    private List<Ability> abilities;

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public Boss build(){
        Boss boss =  new Boss(this.name, this.healthPoints, this.weapon, this.armor, this.abilities);
        reset();
        return boss;
    }

    public BossBuilder(){
    }

    public void reset(){
        this.name = null;
        this.healthPoints = 0;
        this.abilities = null;
        this.armor = null;
        this.weapon = null;
    }
}
