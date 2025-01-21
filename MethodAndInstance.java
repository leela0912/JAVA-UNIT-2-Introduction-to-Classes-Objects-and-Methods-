class box{
    double width;
    double height;
    double depth;
    void volume(){
        System.out.println(width*height*depth);
    }
}
public class MethodAndInstance{
    public static void main(String[] args) {
        box mybox1=new box();
        box mybox2=new box();
        mybox1.width=20;
        mybox1.height = 10;
        mybox1.depth=5;
        //2nd box
        mybox2.width=7;
        mybox2.height=9;
        mybox2.depth=5;
        mybox1.volume();
        mybox2.volume();
    }
}