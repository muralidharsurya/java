public class ClassA
{
    void meth1() // meth1
    {
        int a = 10;
        System.out.println( a+90);
        System.out.println(50);
    }
    void meth2() // main meth
    {
         int a =100;
         ClassA aobj=new ClassA();
        System.out.println(100-1);
       aobj.meth1();
        System.out.println("Hello World");

    }

    public static void main(String[] args) {
        System.out.println("satya");
        ClassA aobj=new ClassA();
        aobj.meth2();
        System.out.println(" java is awesome");
    }
}

