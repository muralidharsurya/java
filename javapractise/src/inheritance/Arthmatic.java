package inheritance;

interface  Calculator{
    void add();
    void sub();
    void multi();
    void div();
    void mod();
}
   class Dev_Calculator implements Calculator {
    int a=100,b=200;
       public void add() {
           System.out.println(a+b);
       }
       @Override
       public void sub() {
           System.out.println(a-b);
       }
       @Override
       public void multi() {
           System.out.println(a*b);
       }
       @Override
       public void div() {
           System.out.println(a/b);
       }
       @Override
       public void mod() {
           System.out.println(a % b);
       }
}
public class Arthmatic {
    public static void main(String[] args) {
        Calculator c1=new Dev_Calculator();
        c1.add();
        c1.mod();
        c1.multi();c1.div();c1.sub();

    }
}

