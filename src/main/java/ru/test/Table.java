package ru.test;

import java.util.ArrayList;
import java.util.HashMap;

public class Table {
    HashMap<String, HashMap<String, ArrayList<Integer>>> usersDataMap;

    public Table(HashMap<String, HashMap<String, ArrayList<Integer>>> usersDataMap) {
        this.usersDataMap = usersDataMap;
    }

    public HashMap<String, HashMap<String, ArrayList<Integer>>> getUsersDataMap() {
        return usersDataMap;
    }
}
