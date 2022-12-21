package ru.test;
//[58, 57, 59, 60, 55]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Table table = new Table(init());

        //write here your code, cadet
    }

    public static HashMap<String, HashMap<String, ArrayList<Integer>>> init() {
        HashMap<String, HashMap<String, ArrayList<Integer>>> initMap = new HashMap<>();

        //Запись для Олега
        String user = "Oleg";
        HashMap<String, ArrayList<Integer>> userDataMap = new HashMap<>();

        String field = "expenses_month1";
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(3000, 4000, 9900));
        userDataMap.put(field, array);

        field = "profit_month2";
        array = new ArrayList<>(Arrays.asList(8000, 10000, 50000, 6000));
        userDataMap.put(field, array);

        initMap.put(user, userDataMap);

        //Запись для Натали
        user = "Nataly";
        userDataMap = new HashMap<>();

        field = "expenses_month1";
        array = new ArrayList<>(Arrays.asList(10000, 4000, 1000));
        userDataMap.put(field, array);

        field = "expenses_month2";
        array = new ArrayList<>(Arrays.asList(2000, 17000));
        userDataMap.put(field, array);

        initMap.put(user, userDataMap);

        return initMap;
    }
}
