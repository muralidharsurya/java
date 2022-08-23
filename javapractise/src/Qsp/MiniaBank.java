package Qsp;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import sun.util.resources.ga.LocaleNames_ga;

import java.util.Scanner;

public class MiniaBank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter balance amount");
        int balance = sc.nextInt();
        System.out.println("ENTER ACCOUNT NUMBER");
        long accountnumber=sc.nextLong();
        System.out.println("Enter ifsc Code");
        String ifccode=sc.next();
        System.out.println("Enter account holder name ");
        String accholdername=sc.next();
        System.out.println("option 1:"+" "+"All details" );
        System.out.println(balance+"\n"+accountnumber+"\n"+ifccode+"\n"+accholdername);
        System.out.println("Enter Deposite amount");
        int Deposite=sc.nextInt();
        switch(Deposite) {
            case 1:
                System.out.println("option 2:"+"Avalable balance"+":"+(balance+Deposite));
                break;
        }
        System.out.println("enter Withdrawl amount");
        int withdrawl=sc.nextInt();
        if (withdrawl>balance){
            System.out.println("option3:"+"insufficient found");
        }else if(withdrawl<balance){
            System.out.println("option4:"+((balance+Deposite)-withdrawl));
        }
        else {
            System.out.println("Exit");
        }

    }
}
