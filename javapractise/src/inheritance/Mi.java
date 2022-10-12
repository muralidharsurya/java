package inheritance;
// multi inheritance through interface
interface A{
    public void m1();
}
interface B{
    public void m2();
}
class C implements A,B{

    @Override
    public void m1() {
        System.out.println("  method m1");
    }

    @Override
    public void m2() {
        System.out.println("m2 method");

    }
}
public class Mi {
    public static void main(String[] args) {
        C c=new C();
        c.m1();c.m2();
    }
}
