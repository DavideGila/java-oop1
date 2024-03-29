package org.learning.javashop;

import java.util.Random;

public class Prodotto {
    // ATTRIBUTI
    public int code;
    public String name;
    public  String description;
    public  double price;
    public  double iva;

    // COSTRUTTORI
    public Prodotto(int code, String name, String description, double price, double iva) {
        this.code = generateRandomCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    // METODI
    public int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(100000000);
    }

    public double getBasePrice() {
        return price;
    }

    public double getPriceWithIVA() {
        return price + (price * iva);
    }

    public String getExtendedName() {
        String paddedCode = String.format("%08d", code);
        return paddedCode + "-" + name;
    }
}
