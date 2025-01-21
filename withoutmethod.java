class box{
    double width;
    double height;
    double depth;
}
public class withoutmethod{
    public static void main(String[] args) {
        box mybox=new box();
        mybox.width=10;
        mybox.height=7;
        mybox.depth=3;
        double vol=mybox.width*mybox.height*mybox.depth;
        System.out.println(vol);

    }
}