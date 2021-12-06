package com.learn.java.basic.main;

import com.learn.java.basic.entity.*;

public class App {

    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addToBasket(new Microwave(120.5, "Bosch", "Microwave Super", 1200, "Grill"));
        basket.addToBasket(new Bookmark("Bookmark for happiness", "Paper", 0.65));
        basket.addToBasket(new Book("Book about cats", "Cats and kittens", "Barbra J.P.", 21.8));
        basket.addToBasket(new ChristmasTree("Good Christmas tree", 1, 10.4));
        basket.addToBasket(new Flowerpot("Flowerpot for palms", "white", 32.8));
        basket.addToBasket(new Flowerpot("Flowerpot for palms", "black", 32.8));
        basket.addToBasket(new Refrigerator(504, "Indesit", "Fridge for life", 234, "Classic"));

        System.out.println(basket.getTotalPrice());
        System.out.println(basket.cheque());
    }
}
