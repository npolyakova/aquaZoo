package ru.qameta.zoo;

import java.util.Random;

public class Aquarium { //FIXME

    Random r = new Random();

    int price;

    int size;

    public void getInfo() {
        System.out.printf("Price: %d\nSize: %d\n", this.price, this.size);
    }

    public Aquarium(int price, int size) {
        this.price = price;
        this.size = size;
    }

    public Aquarium() {
        this.price = r.nextInt(800, 4000);
        this.size = r.nextInt(3, 7);
    }
}
