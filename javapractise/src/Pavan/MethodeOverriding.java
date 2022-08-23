package Pavan;
class Bank{
    double rateofInterest(){
        return 0;
    }
}
class SBI extends Bank{
      double rateofInterest(){
          return 23.5;
      }
}
class ICICI extends Bank{
    double  rateofInterest(){
        return 98.7;
    }
}
class AXIS extends Bank{
    @Override
    double rateofInterest() {
        return 6.8;
    }
}




public class MethodeOverLoading {
    public static void main(String[] args) {
        SBI sbi =new SBI();
        sbi.rateofInterest();

    }
}
