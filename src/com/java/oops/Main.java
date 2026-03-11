package com.java.oops;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        customer cu=new customer();
        System.out.println("Name : "+cu.name);
        System.out.println("Age : "+cu.age);
        System.out.println("phone number : "+cu.phoneNo);
        System.out.println("Email : "+cu.email);
        System.out.println("customer Id : "+cu.cos_Id);
        System.out.println("Gender : "+cu.gender);
        System.out.println("Region : "+cu.region);
        customer cu2=new customer("pranay","8919836703",20,"M",6699,"pranaypuvvati@gmail.com","India");
        System.out.println("Name : "+cu2.name);
        System.out.println("Age : "+cu2.age);
        System.out.println("phone number : "+cu2.phoneNo);
        System.out.println("Email : "+cu2.email);
        System.out.println("customer Id : "+cu2.cos_Id);
        System.out.println("Gender : "+cu2.gender);
        System.out.println("Region : "+cu2.region);
    }
}