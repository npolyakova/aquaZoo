package ru.qameta.zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static Fish[] fishes = new Fish[3];
    static List<Aquarium> aqs = new ArrayList<>();

    private static void setDefaultData() {
        Aquarium defaultAq = new Aquarium(0, 3);
        Fish f1 = new Fish(defaultAq);
        Fish f2 = new Fish(defaultAq);
        Fish f3 = new Fish(defaultAq);

        fishes[0] = f1;
        fishes[1] = f2;
        fishes[2] = f3;

        Aquarium aq1 = new Aquarium();
        Aquarium aq2 = new Aquarium();

        aqs.add(aq1);
        aqs.add(aq2);
    }

    private static void showMenu() {
        System.out.println("Здравствуйте! Желаете сделать покупку? Сегодня у нас есть:");
        for (int i = 0; i < fishes.length; i++) {
            System.out.println("Рыбка #" + (i + 1) + " ");
            fishes[i].getInfo();
            System.out.println();
        }
        aqs.forEach(aq -> {
            System.out.println("Аквариум # " + (aqs.indexOf(aq) + 1));
            aq.getInfo();
            System.out.println();
        });
        System.out.println();
    }

    public static void main(String[] args) {
        setDefaultData();
        showMenu();
    }
}
