package Intaterf;

interface A
{
    int a=10;  // by defult variable i interface are static and final
    void m1();//  abstract method, by default public
}
public class Test implements A {
    public void  m1(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        /*Test t=new Test();
        t.m1();*/
        A a=new Test();
        a.m1();
    }
}
