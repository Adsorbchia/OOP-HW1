package org.ex.seminar1.hw1;

import java.util.ArrayList;

public class HotDrinksVendingMachine implements VendingMachineH{
    private static ArrayList <HotDrink> list;
    public HotDrinksVendingMachine() {
        list = new ArrayList<>();
    }
    public void addHotDrinksList(HotDrink newEl){
        list.add(newEl);
    }
    public static ArrayList getProduct(String searchName){
        ArrayList<HotDrink> resultList = new ArrayList<>();
        for (HotDrink el:list) {
            if(el.getName().contains(searchName)){
                resultList.add(el);
            }
        }
        return resultList;
    }

    public ArrayList getProduct(String searchName, Integer searchVolume){
        ArrayList<HotDrink> resultList = new ArrayList<>();
        for (HotDrink el:list) {
            if (el.getName().contains(searchName) && el.getVolume().equals(searchVolume)){
                resultList.add(el);
        }
    }
        return resultList;


}
    public ArrayList getProduct(String searchName, Integer searchVolume,Integer searchTemperature){
        ArrayList<HotDrink> resultList = new ArrayList<>();
        for ( HotDrink el :list) {
            if (el.getName().contains(searchName) && el.getVolume().equals(searchVolume) &&
                    el.getTemperature().equals(searchTemperature)){
                resultList.add( el);
            }
        }
        return resultList;


    }
}
