package inheritance;

import java.awt.image.VolatileImage;
import java.sql.SQLOutput;

interface Automobile{
    void engine();
    void accelerate();
    void brakes();
    void comfort();
    void design();
}
abstract class Honda implements Automobile{
    public void engine(){
        System.out.println("Engine horse power is very high");
    }
    public void accelerate(){
        System.out.println("To apply the accelerate");
    }
    public void brakes(){
        System.out.println("to apply brakes");
    }
}
 class Honda_Designer extends Honda{
    public void comfort(){
        System.out.println("it is very comfort");
    }
    public void design(){
        System.out.println("its design is very rare");
    }
}
public class CatApp {
    public static void main(String[] args) {
        Automobile a= new Honda_Designer();
        a.accelerate();
        a.brakes();a.engine();a.design();a.comfort();


    }
}
