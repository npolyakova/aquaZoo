package ru.qameta.zoo;

import java.util.Random;

public class Aquarium {

    Random r = new Random();

    int price;

    int size;

    public Aquarium createDefaultAquarium() {
        return new Aquarium(0, 5);
    }

    private Aquarium(int price, int size) {
        this.price = price;
        this.size = size;
    }

    public Aquarium() {
        this.price = r.nextInt(800, 4000);
        this.size = r.nextInt(3, 7);
    }
}
