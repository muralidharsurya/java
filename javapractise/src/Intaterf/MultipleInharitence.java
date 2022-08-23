package Intaterf;
interface ABC{
    int x=109;
    void m1();
}
interface SME{

    int y=239;
    void m2();
}
public class MultipleInharitence implements ABC,SME{
    public void m1(){
        System.out.println(x);
    }
    public void m2(){
        System.out.println(y);
    }

    public static void main(String[] args) {
        MultipleInharitence mi= new MultipleInharitence();
        mi.m1();
        mi.m2();
    }
}
