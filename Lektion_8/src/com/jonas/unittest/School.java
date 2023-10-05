package com.jonas.unittest;

public class School {

    String name;
    int rating;

    Student student;

    public School(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public void introduceStudent(Student student){
        System.out.println("Hello there, my name is " + student);
    }
}
