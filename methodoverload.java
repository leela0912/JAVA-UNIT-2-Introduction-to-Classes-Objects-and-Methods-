class compare{
    int compare(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    char compare(char c1,char c2){
        if(c1>c2){
            return c1;
        }
        else{
            return c2;
        }
    }
    String compare(String s1,String s2){
        if(s1.equals(s2)){
            return "equal";
        }
        else if (s1.compareTo(s2) > 0) {
            return s1 + " is greater";
        }
        else {
            return s2 + " is greater";
        }
    }
}
public class methodoverload{
    public static void main(String[] args) {
        compare ic=new compare();
        int result = ic.compare(1,3);
        System.out.println("addition of integers is: "+result);    
        char result1=ic.compare('A','B');
        System.out.println("addition of char is: "+result1);
        String result2=ic.compare("gitam","gitam");
        System.out.println("addition of strings is: "+result2);
    }
}