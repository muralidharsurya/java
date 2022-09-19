package inheritance;
class Bank {
     String name;
    static String accnt_type;
   void cut(){
       name="RBI";
       accnt_type="Current Acct";
       System.out.println(name);
       System.out.println(accnt_type);
    }
}

   class ICICI extends Bank {
       String accunt_no = "IOB234676";
       float balance = 40234.34f;

       public void cut2() {
           System.out.println("customer2");
       }
       public static void main(String[] args) {
           ICICI ic = new ICICI();
           ic.cut();
           ic.cut2();
           System.out.println(ic.accunt_no);
           System.out.println(ic.balance);
       }
   }

   class IPrudential extends ICICI{

   }

   class RunBank{
       public static void main(String[] args) {
           ICICI ic = new ICICI();
           ic.cut();
           ic.cut2();
           System.out.println(ic.accunt_no);
           System.out.println(ic.balance);
       }
   }






