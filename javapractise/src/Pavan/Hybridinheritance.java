package Pavan;
class s1
{
    void m1(){
        System.out.println("this is  m1 method from s1,class");
    }
}
interface d1
{
    void m2();
}
interface d2
{
    void m3();
}
public class Hybridinheritance extends s1 implements d1,d2{
    public void m2(){
        System.out.println("this is m2 method from d1,inter face");
    }
    public void m3(){
        System.out.println("this is m3 method from d2,inter face");
    }
    public static void main(String[] args) {
        Hybridinheritance hb= new Hybridinheritance();
        hb.m1();
        hb.m2();
        hb.m3();

    }
}
