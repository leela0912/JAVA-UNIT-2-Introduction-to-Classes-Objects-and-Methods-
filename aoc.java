
import java.util.Scanner;
class aoc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char a,b;
        System.out.println("enter a value: ");
        a=sc.next().charAt(0);
        System.out.println("enter b value: ");
        b=sc.next().charAt(0);
        int addition=a+b;
        int subtraction=a-b;
        double mutliplication=a*b;
        float division=a/b;
        double remainder = a%b;
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println("addition is: "+addition);
        System.out.println("subtraction is: "+subtraction);
        System.out.println("multiplication is: "+mutliplication);
        System.out.println("division is: "+division);
        System.out.println("remainder is : "+remainder);
    }
}