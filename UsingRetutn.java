class box{
    double width;
    double height;
    double depth;
    double volume(){
        return width*height*depth;
    }
}
public class UsingRetutn{
    public static void main(String[] args) {
        box mybox1=new box();
        box mybox2=new box();
        mybox1.width=20;
        mybox1.height=10;
        mybox1.depth=5;
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        double vol=mybox1.volume();
        System.out.println("volume1 is: "+vol);
        double vol1=mybox2.volume();
        System.out.println("volume2 is "+vol1);
    }
}