package Pavan;

class Bank{ // if sub class (chaild class)has the same method as declared in parent class
    double rateofInterest(){
        return 0;
    }
}
class SBI extends Bank{
      double rateofInterest(){
          return 24.5;
      }
}
class ICICI extends Bank{
    double  rateofInterest()
    {
        return 98.7;
    }
}
class AXIS extends Bank{
    @Override
    double rateofInterest() {
        return 6.8;
    }
}




public class MethodeOverriding {
    public static void main(String[] args) {
        SBI sbi =new SBI();
        System.out.println( sbi.rateofInterest());
        ICICI icici=new ICICI();
        System.out.println(icici.rateofInterest());

    }
}
