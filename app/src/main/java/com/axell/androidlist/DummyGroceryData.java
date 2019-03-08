package com.axell.androidlist;

import java.util.ArrayList;
import java.util.List;

public class DummyGroceryData {
    public static List<Grocery> groceryList() {
        Grocery telur = new Grocery("telur", 10);
        Grocery sabun = new Grocery("sabun", 2);
        Grocery kopi = new Grocery("kopi", 5);
        Grocery teh = new Grocery("teh", 2);

        List<Grocery> groceryList = new ArrayList<>();

        groceryList.add(telur);
        groceryList.add(sabun);
        groceryList.add(kopi);
        groceryList.add(teh);

        return groceryList;
    }
}
