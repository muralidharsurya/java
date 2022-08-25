package Pavan;
interface surya
{
    int x=134;
    void m2();
}
interface qsp {
    void m3();
    int a = 23;
}
public class MultipleInterfaceDemo1 implements surya,qsp
{
  public void m2(){
      System.out.println(x);
  }
  public void m3(){
      System.out.println(a);
  }

    public static void main(String[] args) {
        MultipleInterfaceDemo1 mi=new MultipleInterfaceDemo1();
        mi.m2();
        mi.m3();
    }
}
