import java.util.Scanner;
class ACC{
    double balance;
    double start(double amount){
        balance=amount;
        return balance;
    }
    double deposit(double deposit_amount){
        balance=balance+deposit_amount;
        return balance;
    }
    double withdrawl(double withdrawl_amount){
        if(withdrawl_amount>balance){
            System.out.println("withdrawl failed");
        }
        else{
            balance=balance-withdrawl_amount;
            return balance;
        }
        return balance;
    }
}
public class accounts{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ACC a=new ACC();
        double result=a.start(65000.59);
        System.out.println("total amount is:"+result);
        double result1;
        double deposit_amount=sc.nextDouble();
        result1=a.deposit(deposit_amount);
        System.out.println("THE TOTAL AMOUNT AFTER DEPOSITING:"+result1);
        double withdrawl_amount=sc.nextDouble();
        double result2=a.withdrawl(withdrawl_amount);
        System.out.println("the toatal amount after withdrawl is:"+result2);
    }
}