public class MyClass {
    static void myMethod(){
        System.out.println("I Just Got Executed !");
    }

    public static void main(String[] args){
        myMethod();
        myMethod();
        myMethod();
    }
}
    // Outputs " I Just Got Executed "