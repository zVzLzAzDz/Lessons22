package by.itstep.vlad.controller;

import by.itstep.vlad.model.data.Student;

public class Main {
    public static void main(String[] args) {

        // constructor with params
        Student student1 = new Student("Vlad", 24, 8, true);

//        default constructor
//        student1.name = "Vlad";
//        student1.age = 24;
//        student1.mark = 8.5;
//        student1.alive = true;

        Student student2 = new Student("Anna");
        Student student3 = new Student();

                   //
        Student student4 = new Student();
        student4.name = student1.name;
        student4.age = student1.age;
        student4.mark = student1.mark;
        student4.alive = student1.alive;


        // copy constructor
        Student student5 = new Student(student1);
        Student student6 = new Student(student1);
        Student student7 = new Student(student1);


        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
        System.out.println(student4.getInfo());
        System.out.println(student5.getInfo());
        System.out.println(student6.getInfo());
        System.out.println(student7.getInfo());


    }
}
