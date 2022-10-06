package by.itstep.vlad.controller;

import by.itstep.vlad.model.data.Student;
import by.itstep.vlad.model.logic.Manager;

public class Controller {
    public static void main(String[] args) {

        Student student1 = new Student("Vlad", 20, 10, true);
        Student student2 = new Student("Vlad", 20, 9, true);
        Student student3 = new Student("Vlad", 20, 6, true);

        Student[] students = {student1, student2, student3};

        double result = Manager.calculateAvgStusentMark(students);

        System.out.printf("Average student's marks is %.2f.", result);

    }
}
