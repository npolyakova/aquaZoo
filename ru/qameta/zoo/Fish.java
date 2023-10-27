package ru.qameta.zoo;

public class Fish { //FIXME

    int price;

    private int rarity; //1, 2, 3

    int profit;

    Aquarium aquarium;

    public void changeAquarium(Aquarium aq) {
        this.aquarium = aq;
    }

    public void setRarity(int rarity) {
        if (rarity < 4 && rarity > 0) {
            this.rarity = rarity;
        } else {
            System.out.println("Введите число от 1 до 3");
        }
    }

    public int getRarity() {
        return rarity;
    }
}
