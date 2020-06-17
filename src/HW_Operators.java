public class HW_Operators {
    static int a = 100;
    static int b = 200;
    static int ans;
    //This are arithmetic operators
    static void add (){
        ans = (a + b);
        System.out.println("This is addition of " + a +  " + " +  b + " = " + ans);
    }
    static void sub (){
        ans = a - b ;
        System.out.println("This is subtraction of " + a + " - " + b + " = " +  ans);
    }
    static void multiply (){
        ans = a * b ;
        System.out.println("This is Multiplication of " + a + " * " + b + " = " + ans);
    }
    static void division() {
        ans = a /b;
        System.out.println("This is division of " +  a + " / " + b + " = " + ans);
    }
    public static void main (String [] args){
        add();
        sub();
        multiply();
        division();
    }
}
