package by.itstep.vlad.model.data;

//entity-class
public class Student {
    public String name;
    public int age;
    public double mark;
    public boolean alive;


    // default constructor
    public Student() {
        name = "No name";
        age = 16;
        mark = 4;
        alive = true;

    }

    // constructor
    public Student(String n, int a, double m, boolean al) {
        name = n;
        age = a;
        mark = m;
        alive = al;

    }

    public Student(String n) {
        name = n;

    }

    public Student(boolean al) {
        alive = al;

    }

    // constructor copy
    public Student(Student student) {
        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;

    }

    public String getInfo() {
        return name + ": age = " + age + ", mark = " + mark + ", is alive = " + (alive ? "yes" : "no");
    }
}