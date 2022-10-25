package AbstractClassVsJava8Interface;

public class Example2 extends Example1{

    public int add(int a, int b){ //implementing abstract method
        return a+b;
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();
        int result1 = obj.add(10, 20); //calling abstract method
        int result2 = obj.sub(20, 30); //calling non-abstract method
        int result3 = Example1.multiply(10, 34); //calling static method
        System.out.println("Addition - " + result1);
        System.out.println("Subtraction - " + result2);
        System.out.println("Multiplication - " + result3);
    }
}
