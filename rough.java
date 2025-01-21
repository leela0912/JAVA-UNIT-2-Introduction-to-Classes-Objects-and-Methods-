import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    // Default constructor
    Student() {
        System.out.println("This is a default constructor.");
        id = 0;
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Student student1 = new Student();
        student1.display();

        // Using parameterized constructor
        System.out.println("Enter student details: ID, Name, Age");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        String name = sc.nextLine();
        int age = sc.nextInt();

        Student student2 = new Student(id, name, age);
        student2.display();

        sc.close();
    }
}
