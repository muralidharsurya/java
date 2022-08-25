package Pavan;

 // final >>> class cannot be extend
  class Bike{   // clas is final
    // final void run() //final variable,so we cannot overrid this method in child class
    {
        System.out.println("Running...");
    }
}
class Honda extends Bike{
    //void run() // comile  time error

    {
        System.out.println("started..");
    }
}
public class FinalMethodD {
    public static void main(String[] args) {
        Bike b=new Bike();
       // b.run();

    }

}
