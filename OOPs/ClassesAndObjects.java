package OOPs;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}


class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }


    // Non-parameterized constructor
    Student() {
        System.out.println("Constructor called");
    }


    // Parameterized constructor
    Student(String name, int age) {
        System.out.println("Parameterized constructor called");
        this.name = name;
        this.age = age;
    }


    // Copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.age = s1.age;
    }
}



public class ClassesAndObjects {

    public static void main(String[] args) {

        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Gel";

        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "Black";

        // pen1.printColor();
        // pen2.printColor();


        Student st1 = new Student();
        st1.name = "Lakshay";
        st1.age = 25;
        // st1. printInfo();


        // Student st2 = new Student("Lakshay", 22);
        // st2.printInfo();


        Student st3 = new Student(st1);
        st3.printInfo();


    }
}
