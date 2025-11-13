import java.util.Scanner;

abstract class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void displayDetails();
}
class Student extends Person {
    String course;
    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
class Employee extends Person {
    String department;

    Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person; // Reference of abstract class

        System.out.println("Enter 1 for Student or 2 for Employee:");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter course: ");
            String course = sc.nextLine();
            person = new Student(name, age, course);
        } else {
            System.out.print("Enter department: ");
            String department = sc.nextLine();
            person = new Employee(name, age, department);
        }

        person.displayDetails();
        sc.close();
    }
}
