package QspModule2;

import sun.text.normalizer.UBiDiProps;

import java.rmi.server.UID;

public class MethodOverloading {
    public static void payment(String wallettype,String UID){
        System.out.println("wallettype:"+wallettype);
        System.out.println("UID:"+UID);

        }
    public static void payment(String cardtype, long cardno,int cvvno){
        System.out.println("cardtype"+cardtype);
        System.out.println("cardno:"+cardno);
        System.out.println("cvvno:"+cvvno);
    }
    public static void payment(String type, String uname,int pwd,long accno){
        System.out.println("type"+type+" "+uname+ " " + pwd+""+accno);
        System.out.println("uname:"+uname);
        System.out.println("password:"+pwd);
        System.out.println("Accontno:"+accno);

    }

    public static void main(String[] args) {
        payment("phonepay", "UPI5t65B");
        payment("master",1154253534,2345);
        payment("Netbanking","surya",865786,656587674);
    }
}

