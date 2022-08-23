package Pavan;

public class ThisKeyword {
    int a,b;    //instance variable or class variable
    //void getvalue(int x,int y)
    // a=x ;
    //  b=y;
    void getvalue(int a,int b){ // method variables/external variables
        this.a=a ;     //this.a,this.b is class variable
        this.b=b;     // a,b's  are  method variable
    }
   void printVaules (){
       System.out.println(a);
       System.out.println(b);
    }
    public static void main(String[] args) {
        ThisKeyword th=new ThisKeyword();
        th.getvalue(12,34);th.printVaules();
    }

}
