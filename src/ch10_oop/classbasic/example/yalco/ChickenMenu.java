package ch10_oop.classbasic.example.yalco;

public class ChickenMenu {
    String name;
    int price;
    String cook = "fry";

    ChickenMenu (String name, int price) {
        this.name = name;
        this.price = price;
    }

    ChickenMenu (String name, int price, String cook) {
        this.name = name;
        this.price = price;
        this.cook = cook;
    }
}