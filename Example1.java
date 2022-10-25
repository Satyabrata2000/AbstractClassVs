package AbstractClassVsJava8Interface;

abstract class Example1 {

    public Example1(){  //Constructor
        System.out.println("We can create constructor in an abstract class");
    }

    abstract int add (int a, int b); //abstract method
    int sub(int a, int b){ //non-abstract method
        return a-b;
    }

    static int multiply (int a, int b){ //static method
        return a*b;
    }
}

