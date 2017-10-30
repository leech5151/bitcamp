package bitcamp.java100.ch07.ex1;

public class Test3 {
    public static void main(String[] args) {
        CalculatorB calc = new CalculatorB();
        calc.result = 1;
        calc.multiple(5);

        calc.divide(0);
        
        calc.multiple(17);
        
        System.out.println(calc.result);
    }
}