package Pavan;

public class Animal {
    String colour="White";
    void eating(){
        System.out.println("eating");
    }
}
   class Dog extends Animal{
    String colour="Black";
    void displaycolour(){
        System.out.println(colour);
           System.out.println(super.colour);
    }
       void eating() {
           System.out.println("dog eating");
           super.eating();
       }
   }
class Cat extends Animal {
    String colour = "Black";
    void barking(){
        System.out.println("mow mow");
        System.out.println(super.colour);

    }

}