package QspModule2;

public class Car            // constructor overloading example
{
    String name,color;
    double price;
    int capacity;
    String model;
   Car(String name, String color){
       this.color=color;
       this.name=name;
   }
       Car(String name, String color,double price){
          this.name=name;
          this.color=color;
           this.price=price;
   }
       Car(String name, String color,double price,int capacity,String model){
           this.name=name;
           this.color=color;
           this.price=price;
           this.capacity=capacity;
           this.model=model;
       }
    public static void main(String[] args) {
        Car c=new Car("Volvo","wight");
        Car c1=new Car("Volvo","wight",3000000);
        Car c2=new Car("volvo","Wight",300003424,3,"A9");
        System.out.println(c.name+c.color);
        System.out.println(c1.name+c1.color+ c1.price);
        System.out.println(c2.name+c2.color+ c2.price+c2.model+c2.capacity);
   }
}
