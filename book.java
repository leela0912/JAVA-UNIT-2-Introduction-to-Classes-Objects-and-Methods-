import java.util.Scanner;
class BOOK{
    int code;
    String title;
    double price;
    BOOK(int c,String t,double p){
        code=c;
        title=t;
        price=p;
    }
    void display(){
        System.out.println("CODE: "+code+" BOOK TITLE: "+title+" PRICE: "+price);
    }
}
public class book{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter code: ");
        int code=sc.nextInt();
        sc.nextLine();
        System.out.println("enter title of the book: ");
        String title=sc.nextLine();
        System.out.println("enter price of the book: ");
        double price=sc.nextDouble();
        BOOK b=new BOOK(code,title,price);
        b.display();
    }
}