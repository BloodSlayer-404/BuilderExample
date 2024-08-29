package org.example;

import org.example.builders.BossBuilder;
import org.example.equipment.Ability;
import org.example.equipment.Armor;
import org.example.equipment.Weapon;

import java.util.ArrayList;
import java.util.Arrays;

public class Director {

    public void constructHornet(BossBuilder builder){
        builder.setName("Hornet");
        builder.setHealthPoints(75);
        builder.setWeapon(
                new Weapon("Stinger", 1.0, 1000)
        );
        builder.setArmor(
                new Armor("Capa Roja", 5, 500)
        );
        builder.setAbilities(
                new ArrayList<>(
                        Arrays.asList(
                                new Ability("Dash", "Realiza un dash hacia adelante con su arma", 5 ),
                                new Ability("Bola Pincho", "Crea bolas de pinchos por el escenario", 10)
                        )
                )
        );
    }

    public void constructPureVessel(BossBuilder builder){
        builder.setName("Vasija Pura");
        builder.setHealthPoints(500);
        builder.setWeapon(
                new Weapon("Big Nail", 2.0, 1500)
        );
        builder.setAbilities(
                new ArrayList<>(
                        Arrays.asList(
                                new Ability("Dash", "Realiza un dash hacia adelante con su arma", 5 ),
                                new Ability("Pinchos de Alma", "Saca 10 pinchos del suelo ", 15)
                        )
                )
        );
    }
}
