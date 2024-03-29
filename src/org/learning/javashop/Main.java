package org.learning.javashop;

public class Main {
    public static void main(String[] args) {
        Prodotto firstProduct = new Prodotto(123, "Felpa", "Felpa viola", 34.99, 0.22);
        Prodotto secondProduct = new Prodotto(456, "Jeans", "Jeans neri strappati", 49.99,
                0.22);

        // Primo prodotto
        System.out.println("First Product");
        System.out.println("Code: " + firstProduct.code);
        System.out.println("Name: " + firstProduct.name);
        System.out.println("Description: " + firstProduct.description);
        System.out.println("Base price: " + firstProduct.getBasePrice());
        System.out.println("Price with iva: " + firstProduct.getPriceWithIVA());
        System.out.println("Extended name: " + firstProduct.getExtendedName());
        System.out.println();

        // Secondo prodotto
        System.out.println("Second Product");
        System.out.println("Code: " + secondProduct.code);
        System.out.println("Name: " + secondProduct.name);
        System.out.println("Description: " + secondProduct.description);
        System.out.println("Base price: " + secondProduct.getBasePrice());
        System.out.println("Price with iva: " + secondProduct.getPriceWithIVA());
        System.out.println("Extended name: " + secondProduct.getExtendedName());
    }
}
