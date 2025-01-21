class varags{
    static int sum(int... num){
        int total=0;
        for(int i:num){
            total+=i;
        }
        return total;
    }
    public static void main(String[] args){
        System.out.println("Sum of 1, 2, 3: " + sum(1, 2, 3));
        System.out.println("Sum of 10, 20: " + sum(10, 20));
        System.out.println("Sum of 5, 15, 25, 35: " + sum(5, 15, 25, 35));
        System.out.println("Sum with no arguments: " + sum());
}
}