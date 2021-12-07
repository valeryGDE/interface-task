package com.learn.java.basic.main;

import com.learn.java.basic.entity.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        List<ChristmasTree> christmasTrees = new ArrayList<ChristmasTree>();
        christmasTrees.add(new ChristmasTree("XXL Christmas tree", 5.26, 129.4));
        christmasTrees.add(new ChristmasTree("Good Christmas tree", 1.26, 120.4));
        christmasTrees.add(new ChristmasTree("Red Christmas tree", 1.24, 30.4));
        christmasTrees.add(new ChristmasTree("Bad Christmas tree", 3, 23.4));
        christmasTrees.add(new ChristmasTree("Normal Christmas tree", 2, 35.4));

        System.out.println(christmasTrees);

        Collections.sort(christmasTrees);
        System.out.println(christmasTrees);

        Collections.sort(christmasTrees, new ChristmasTreePriceComparator());
        System.out.println(christmasTrees);

        Collections.sort(christmasTrees, new ChristmasTreeNameComparator());
        System.out.println(christmasTrees);

    }
}
