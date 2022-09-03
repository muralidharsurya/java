package Pavan;// unchecked expception

public class Exceptiona_finallyBlock {
    public static void main(String[] args) {
        System.out.println("Program Started");

        int a=100;

        try{
           // System.out.println(a/2); // not throw an exception;
            System.out.println(a/0);  // arthamatic exception
        }
       // catch (Exception e){
        //catch (NullPointerException e){
        catch (ArithmeticException e) {                   //  this catch block is handle  only null pointer exception
            System.out.println("Enter into catch block"); //catch block is ignored
          }
        finally {
            System.out.println(" Enter into Finally Block");
        }
        System.out.println("Program excicuted");
    }

}
