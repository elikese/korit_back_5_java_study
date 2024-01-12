package com.study.exercise.builder;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();


        Customer customer = Customer.builder()
                .chatNum(20240000+i)
                .name("i번손님")
                .phone("0101234567" + i)
                .build();



    }
}
