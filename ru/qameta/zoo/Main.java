package ru.qameta.zoo;

public class Main {

    public static void main(String[] args) {
        Fish f = new Fish();
//        f.setRarity(100);

        Aquarium aq = new Aquarium();

        System.out.println(aq.price);
        System.out.println(aq.size);
    }
}
