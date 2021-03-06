package com.learn.java.basic.comparator;

import com.learn.java.basic.entity.ChristmasTree;

import java.util.Comparator;

public class ChristmasTreeNameComparator implements Comparator<ChristmasTree> {

    @Override
    public int compare(ChristmasTree o1, ChristmasTree o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
