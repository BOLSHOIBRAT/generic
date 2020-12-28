package org.itstep;

// FIXME: реализовать интерфейс Comparable<Tea>. Метод compareTo() должен производить сравнение по цене
public class Tea {
    private final String name;
    private final double price;

    public Tea(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Чай: " + name + " Цена: " + price;
    }
}
