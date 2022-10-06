package by.itstep.vlad.controller;

import by.itstep.vlad.model.data.Student;

public class SecondMain {
    public static void main(String[] args) {
//        int a = 10;
//        int b = a;
//        a = 20;
//        b = 20;
//        System.out.println(a = b);
//        System.out.println(a != b);

//        Student student1 = new Student("Vlad");
//        Student student2 = student1;
//        student1.name = "Alexandra";
//        System.out.println(student1.name);

        Student a = new Student();
        Student b = new Student();
        System.out.println(a == b);
        System.out.println(a != b);


    }
}
