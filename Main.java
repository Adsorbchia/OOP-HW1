package org.ex.seminar1.hw1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine hotDrinksVendingMachine=new HotDrinksVendingMachine();
        hotDrinksVendingMachine.addHotDrinksList(new Coffee("капучино",100,105.5,70));
        hotDrinksVendingMachine.addHotDrinksList(new Tea("Гринфилд",100,50.0,100));
        hotDrinksVendingMachine.addHotDrinksList(new Tea("Зеленый чай",150,100.0,70));
        hotDrinksVendingMachine.addHotDrinksList(new Tea("Черный чай",200,50.0,50));
        hotDrinksVendingMachine.addHotDrinksList(new Coffee("Латте", 100, 155.5,70));
        ArrayList list = hotDrinksVendingMachine.getProduct("Зеленый чай");
        System.out.println(list);
        ArrayList list1= hotDrinksVendingMachine.getProduct("Гринфилд", 100, 100);
        System.out.println(list1);
        ArrayList list2=hotDrinksVendingMachine.getProduct("капучино",100,70);
        System.out.println(list2);

    }
}
