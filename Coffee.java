package org.ex.seminar1.hw1;

public class Coffee extends HotDrink{
    private Integer temperature;

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Coffee(String name, Integer volume, Double price, Integer temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }



    }

