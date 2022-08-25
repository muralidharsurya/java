package Pavan;

  class  Bike1 { // final class,so we cannot extend into child class
   int speed=49;
    void run(){
        System.out.println(speed);
    }
}
class Honda1 extends Bike1{ // compile time error

}
public class FinalClassD {
    public static void main(String[] args) {

    }
}
