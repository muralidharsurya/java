package demoabstract;



abstract class  Car {
    abstract  public  void accelarate ();
    abstract public void brakes ();
}
 class Honda extends Car{
    public void accelarate (){
        System.out.println("acc to design of Honda architecture");
    }
    public void brakes ()
    {
        System.out.println("acc to design of honda architecture");
    }
}

public class Showroom {
    public static void main(String[] args) {
        Car c1 = new Honda() ;
        c1.accelarate();
        c1.brakes();





        }

    }

