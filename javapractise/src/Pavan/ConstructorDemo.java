package Pavan;

public class ConstructorDemo {
    int x;
    int y;
     ConstructorDemo(){  // default Construnctor
         x=10;
         y=20;
     }
     ConstructorDemo(int a,int b){ // parameterized constructor
         x=a;
         y=b;
     }
     void display()
     {
         System.out.println(x+y);
     }
    public static void main(String[] args) {
           ConstructorDemo cm1=new ConstructorDemo  ();// invokes default constructor
        cm1.display();
        ConstructorDemo cm2=new ConstructorDemo(200,104);

         cm2.display();

        }


}
