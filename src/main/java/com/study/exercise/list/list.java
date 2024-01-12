package com.study.exercise.list;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class list {
    public static void main(String[] args) {
        HashMap<Integer, String> customerList = new HashMap<>();
        for (int i = 0; i < 10 ; i++) {
            customerList.put(i+1,"손님" + (i+1));
        }
        System.out.println(customerList.toString());

        HashSet<Customer> customerHashSet = new HashSet<>();
        Customer a = new Customer("과자","1","1",1);
        Customer b = new Customer("과자","1","1",1);
        customerHashSet.add(a);
        customerHashSet.add(b);
        System.out.println(customerHashSet.iterator());
        ArrayList<Customer> customerArrayList = new ArrayList<>();

    }
}
