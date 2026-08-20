package OOPs;

class Student {

    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

}




public class Polymorphism {
    public static void main(String[] args) {
        Student st1 = new Student();

        st1.printInfo("Lakshay");
        st1.printInfo(22);
        st1.printInfo("Lakshay", 22);


    }
}
