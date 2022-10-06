package by.itstep.vlad.model.logic;

import by.itstep.vlad.model.data.Student;

public class Manager {
    public static double calculateAvgStusentMark(Student[] students) {

        double sum = 0;

        for (Student student : students) {
            sum += student.mark;

        }

        return sum / students.length;

    }
}
