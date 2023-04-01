package org.ex.seminar1.hw1;

public class Tea extends HotDrink{
    private Integer temperature;

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Tea(String name, Integer volume, Double price, Integer temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }



    }

