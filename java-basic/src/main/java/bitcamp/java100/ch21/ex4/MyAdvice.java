package bitcamp.java100.ch21.ex4;

public class MyAdvice {
    public void doBefore(String name) {
        System.out.printf("MyAdvice.doBefore(): %s\n", name);
    }
    public void doAfer() {
        System.out.println("MyAdvice.doAfter()");
    }
    public void doAfterReturning(Object returnValue) {
        System.out.printf("MyAdvice.doReturning(): %s\n", returnValue);
    }
    public void doAfterThrowing(Exception error) {
        System.out.printf("MyAdvice.doThrowing(): %s\n", error.getMessage());
    }
    public void doAround() {
        System.out.println("MyAdvice.doAround()");
    }
}