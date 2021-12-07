package com.learn.java.basic.entity;

import java.util.Comparator;

public class ChristmasTreePriceComparator implements Comparator<ChristmasTree> {

    @Override
    public int compare(ChristmasTree o1, ChristmasTree o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
