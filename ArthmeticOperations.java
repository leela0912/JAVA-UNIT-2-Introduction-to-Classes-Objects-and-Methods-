class ao{
    double a;
    double b;
    void solution(){
        System.out.println("addition: "+(a+b));
        System.out.println("subtraction: "+(a-b));
        System.out.println("mutliplication: "+(a*b));
        System.out.println("division: "+(a/b));
        System.out.println("%: "+(a%b));
    }
}
public class ArthmeticOperations{
    public static void main(String[] args) {
        ao mynum=new ao();
        mynum.a=10;
        mynum.b=5;
        mynum.solution();
    }
}