package Pavan;

import java.sql.PreparedStatement;

// all statement syntatically right
public class ExceptionExm {
    public static void main(String[] args) {
        System.out.println(" program is started");
        System.out.println("program is in progress");
        int a=100;
        int  res=0;
        try
        {
          //  System.out.println(a/0); //this Arithmetic  Exception
            res=a/2;
        }
        catch(ArithmeticException e){
            System.out.println("enter in to catch block");
        }
        System.out.println(a);
      //  System.out.println(res);


/*
        String s=null;
        System.out.println(s.length());
*/
        String s="welcome"; // try catch block
        try {
            System.out.println(s.length());
        }
        catch (Exception w)
        {
            System.out.println("enter catch lock");
        }



        String x="abc";
        //  int i =Integer.parseInt(x);

      //  int arr[]=new int [5];
    //    arr[10]=100;
        System.out.println("program is completed");
        System.out.println("program is exited");



    }
}
