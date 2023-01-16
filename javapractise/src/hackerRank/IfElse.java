package hackerRank;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n%2 !=0){
            System.out.println("weird1");
        }
         else if( (2<=n)&(n<=5)) {
            System.out.println("w2");
        } else if ((6<=n)&(n<=20)) {
            System.out.println("W3");
        }
         else {
            System.out.println("w$");
        }
    }
}
