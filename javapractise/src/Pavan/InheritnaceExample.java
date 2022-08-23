package Pavan;
class A{
    int a;
    void display(){
        System.out.println(a);
    }
}
class B extends A{
    int b;
    void print(){
        System.out.println(b);
    }
}
class C extends B{
    int c;
    void show(){
        System.out.println(c);
    }
}



public class InheritnaceExample {
    public static void main(String[] args) {


     /*   A aobj = new A();
        aobj.a = 100;
        aobj.display();*/

//        B bobj=new B();
//        bobj.b=10;
//        bobj.print();

         C cobj=new C();
         cobj.a=103;
         cobj.b=24;
         cobj.c=13;

         cobj.display();
         cobj.print();
         cobj.show();





    }
}
