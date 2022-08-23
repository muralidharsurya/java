package Pavan;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StaticExample {
    static int a=10; //static variable
    int b =39;// non-static variable
     static void m1(){ // static method
         System.out.println("this is m1-static methode");
     }
     void m2(){    // non-static methode
         System.out.println("this is m2 Non-Static methode");
     }
     void m3(){ // non-method can access both static&non-static stuff direct
         System.out.println("m3 methode in non method");
         System.out.println(a);
         System.out.println(b);
         m1();
         m2();
     }



    public static void main(String[] args) {
        // static methods can access only static stuff
        System.out.println(StaticExample.a);  // main mehtod
        StaticExample.m1();

        //System.out.println(b); incorrect, boz b is non-static variable
        //m2(); incorrect, bcoz m2 is non-static method


        //static methods can also access non-static stuff but through object creating
        StaticExample se=new StaticExample();
        System.out.println(se.b);
        se.m2();
          se.m3();
    }
}

