package org.ex.seminar1.hw1;

public abstract class HotDrink {

    private String name;
    private Integer volume;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public HotDrink(String name, Integer volume, Double price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public HotDrink(String name, Integer volume) {
        this.name = name;
        this.volume = volume;
    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private Double price;

    public HotDrink() {
    }

    @Override
    public String toString() {
        return " " + name + " = объём" + " " + volume + " " + "цена" + " " + price + " " + "температура" + " " + getTemperature();
    }

    public abstract Integer getTemperature();
}
