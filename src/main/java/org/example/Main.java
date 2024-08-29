package org.example;

import org.example.builders.BossBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        BossBuilder builder = new BossBuilder();
        Boss hornet;
        Boss pureVessel;

        director.constructHornet(builder);
        hornet = builder.build();

        director.constructPureVessel(builder);
        pureVessel = builder.build();


        System.out.println(hornet.toString());
        System.out.println("\n");
        System.out.println(pureVessel.toString());
    }
}