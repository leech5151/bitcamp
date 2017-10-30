package bitcamp.java100.ch08.ex7;

public class A2 extends A {
    public void test1() {
        m4(); // public 
        m3(); // protected
        m2(); // default
        m1(); // private (B class)
    }
    private void m1() {
        System.out.println("B.m1()");
    }
    @Override
    void m2() {}
    @Override
    protected void m3() {}  
    @Override
    public void m4() {}
}
