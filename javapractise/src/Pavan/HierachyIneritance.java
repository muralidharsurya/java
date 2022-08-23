package Pavan;
class parent {
    int a;
    void disply(){
        System.out.println(a);
    }
}
class child1 extends parent{
     int y;
    void show(){
        System.out.println(y);
    }
}
class chilad2 extends parent{
    int e;
    void print (){
        System.out.println(e);
    }
}
public class HierachyIneritance {
    public static void main(String[] args) {
        child1 c1=new child1();
        c1.a=123;
        c1.y=45;
        c1.disply();
        c1.show();

        chilad2 c2=new chilad2();
        c2.a=2;
        c2.e=234;
        c2.disply();
        c2.print();


    }
}
