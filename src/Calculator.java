public class Calculator {
    public static void main(String[] args){
        System.out.println("This is my calculator");
        add();
        deduct();
        add2();
    }
    public static void add(){
        int a=4;
        int b=6;
        int result= a+b;
        System.out.println("Added velue: " + result);
    }
    public static void deduct(){
        int c=8;
        int b=6;
        int result= c-b;
        System.out.println("Deducted Result: "+ result );
    }
    public static void add2(){
        int d=8;
        int e=11;
        int f=17;
        int result=(d+e+f);
        System.out.println("Total result of 3 number:" +result);
    }
}
