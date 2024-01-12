package com.study.exercise.builder;

public class Customer {
    private int chartNum;
    private String name;
    private String phone;

    public Customer(int chartNum, String name, String phone) {
        this.chartNum = chartNum;
        this.name = name;
        this.phone = phone;
    }

    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "chartNum=" + chartNum +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class CustomerBuilder{
        private int chartNum;
        private String name;
        private String phone;

        public CustomerBuilder chatNum(int CharNum) {
            this.chartNum = chartNum;
            return this;
        }
        public CustomerBuilder name(String name) {
            this.name = name;
            return this;
        }
        public CustomerBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public Customer build() {
            return new Customer(chartNum, name, phone);
        }
    }

}
