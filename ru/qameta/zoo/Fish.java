package ru.qameta.zoo;

import java.util.Random;

public class Fish { //FIXME

    private int price;

    private int rarity; //1, 2, 3

    private int profit;

    private Aquarium aquarium;

    public void setAquarium(Aquarium aq) {
        this.aquarium = aq;
    }

    public void getInfo() {
        System.out.printf("Price: %d\nRarity: %d\nProfit: %d\n", this.price, this.rarity, this.profit);
    }

    private void setRandomPrice(int rarity) {
        switch (rarity) {
            case 1 -> this.price = new Random().nextInt(100, 300);
            case 2 -> this.price = new Random().nextInt(400, 800);
            case 3 -> this.price = new Random().nextInt(900, 1500);
            default -> System.out.println("Ошибка выполнения программы");
        }
    }

    private void setRandomRarity() {
        this.rarity = new Random().nextInt(1, 4);
    }

    private void setProfit(int rarity) {
        switch (rarity) {
            case 1 -> this.profit = 10;
            case 2 -> this.profit = 20;
            case 3 -> this.profit = 30;
            default -> System.out.println("Ошибка выполнения программы");
        }
    }

    public int getProfit() {
        return this.profit;
    }

    public Fish(Aquarium aq) {
        setRandomRarity();
        setRandomPrice(this.rarity);
        setProfit(this.rarity);
        this.aquarium = aq;
    }
}
