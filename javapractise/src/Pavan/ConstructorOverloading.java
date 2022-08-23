package Pavan;

public class ConstructorOverloading {
    ConstructorOverloading(int a,int b){
      //  this(2,4.5);                                 constructor chaining process
        System.out.println(a+b);

    }
    ConstructorOverloading(int a,double b){
      //  this(3.5,5);
        System.out.println(a+b);
    }
    ConstructorOverloading(double a,int b){
      //  this(3,5,6);
        System.out.println(a+b);
    }
    ConstructorOverloading(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        ConstructorOverloading co=new  ConstructorOverloading(2,5); // parameter are change in single object
    }

}
