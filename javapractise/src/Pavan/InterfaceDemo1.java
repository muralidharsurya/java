package Pavan;

interface T
{
    int a=10; // by default variable a interface are static and final
    void m1();// abstrct method, by default public
}
public class InterfaceDemo1 implements T{

    public void m1() //we must public mention
    {
        System.out.println(a);

    }

    public static void main(String[] args) {
        /*InterfaceDemo1  ifd= new InterfaceDemo1();//new InterfaceDemo is instantetian
        ifd.m1();*/                                  // InterfaceDemo in variable part
        T a=new InterfaceDemo1(); // object creating    class
        a.m1(); //
    }
}
