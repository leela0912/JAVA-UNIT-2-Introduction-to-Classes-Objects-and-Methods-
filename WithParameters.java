class box{
    double width;
    double height;
    double depth;
    double volume(){
        return width*height*depth;
    }
    void setdim(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }
}
public class WithParameters{
    public static void main(String[] args) {
        box mybox1=new box();
        box mybox2=new box();
        mybox1.setdim(10,20,30);
        mybox2.setdim(3,4,5);
        double vol=mybox1.volume();
        System.out.println("mybox1: "+vol);
        double vol1=mybox2.volume();
        System.out.println("mybox2: "+vol1);
    }
}