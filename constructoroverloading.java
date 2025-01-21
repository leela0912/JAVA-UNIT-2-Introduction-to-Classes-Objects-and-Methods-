import java.util.Scanner;
class Student{
    int id;
    String name;
    int age;

    Student(){
        System.out.println("it is a default constructor");
    }
    Student(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }  
    void display(){
        System.out.println("ID:-"+ id+" NAME:-"+ name+" AGE:-"+ age);
    }
}
public class constructoroverloading{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        s1.display();
        System.out.println("Enter student details: ID,NAME,AGE:");
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        int age=sc.nextInt();
        Student s2=new Student(id,name,age);
        s2.display();
    }
}