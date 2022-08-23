package Pavan;

public class ReversString {
    public static void main(String[] args) {


    String str ="WERTY";
    String rev=" ";
    int len=str.length();
    //str.charAt(0);
        for (int i=len-1;i>=0;i--){
             rev=rev+str.charAt(i);

        }
        System.out.println(rev);
}
}
