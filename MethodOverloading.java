package Practice;

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.sum(1, 3));
        System.out.println(calc.sum(12, 13, 14));
        System.out.println(calc.sum((float)1.5, (float)2.5));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
    
    float sum(float a, float b) {
        return a + b;
    }
    
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
