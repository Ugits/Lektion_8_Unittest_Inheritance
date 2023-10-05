package com.jonas.unittest;

public class Main {
    public static void main(String[] args) {

        Student benny = new Student("Benny", 5, true);
        School sti = new School("STI", 10);

        sti.introduceStudent(benny);

       /**
        *  String name= "Teresa";
         int age = 15;

         if (age == 16 && name.equals("Teresa")){
             System.out.println("You really are teresa");
         }
        */
    }
}
