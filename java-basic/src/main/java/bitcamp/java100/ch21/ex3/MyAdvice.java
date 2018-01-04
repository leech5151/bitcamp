package bitcamp.java100.ch21.ex3;

public class MyAdvice {
    public void doBefore() {
        System.out.println("MyAdvice.doBefore()");
    }
    public void doAfer() {
        System.out.println("MyAdvice.doAfter()");
    }
    public void doAfterReturning() {
        System.out.println("MyAdvice.doReturning()");
    }
    public void doAfterThrowing() {
        System.out.println("MyAdvice.doThrowing()");
    }
    public void doAround() {
        System.out.println("MyAdvice.doAround()");
    }
}