package demoabstract;
abstract  class Rbi{
     abstract void getDeposite();
     abstract void getWithdraw();
     abstract  void getLoans();
        }
        abstract  class Sbi extends Rbi{
    public void getDeposite(){
        System.out.println("Amount will be depossite");
    }
    public void getWithdraw(){
        System.out.println("Amount will be withdraw");
    }
}
       class SbiLoans extends Sbi{

          public void getLoans() {
              System.out.println("loan will be sanction");

           }
       }
public class Customer {
    public static void main(String[] args) {
        Rbi r= new SbiLoans() ;
        r.getDeposite();
        r.getLoans();r.getDeposite();



    }
}
