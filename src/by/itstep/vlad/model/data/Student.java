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



    // constructor with parametr

    public Student(String name, int age, double mark, boolean alive) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.alive = alive;
    }



//    public Student(String name, int age, double mark, boolean alive) {
//        this.name = name;
//        this.age = age;
//        this.mark = mark;
//        this.alive = alive;
//
//    }

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