package Pavan;

public class FinalVariableD {
    final int speed=40;

    public static void main(String[] args) {
        FinalVariableD fv=new FinalVariableD();
       // fv.speed=100; //compile time error
        System.out.println(fv.speed);
    }

}
