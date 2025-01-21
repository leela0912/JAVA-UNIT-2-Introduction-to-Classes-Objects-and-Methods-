public class commandlineargs{
    public static void main(String[] args) {
        args=new String[]{"arg1","arg2","arg3"};
        System.out.println("total number of arguments: "+args.length);
        if(args.length>0){
            System.out.println("the arguments are:");
            for(int i=0;i<args.length;i++){
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
            }
            else{
                System.out.println("no arguments");
        }
    }
}