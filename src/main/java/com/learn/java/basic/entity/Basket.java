package com.learn.java.basic.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket {

    private List<Good> goods;

    public Basket() {
        goods = new ArrayList<Good>();
    }

    public List<Good> getGoods() {
        return goods;
    }

    public void setGoods(List<Good> goods) {
        this.goods = goods;
    }

    public void addToBasket(Good good) {
        goods.add(good);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Good good : goods) {
            totalPrice = totalPrice + good.price();
        }
        return totalPrice;
    }

    public String cheque() {
        String cheque = "Cheque: \n";
        for (Good good : goods) {
            cheque = cheque + "Good: " + good.name() + " \t" + " Price: " + good.price() + "\n";
        }
        return cheque + "Total price: " + this.getTotalPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(goods, basket.goods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goods);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "goods=" + goods +
                '}';
    }
}