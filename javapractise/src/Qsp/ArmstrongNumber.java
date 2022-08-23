package Qsp;
import java.util.Scanner;

// using while loop
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
    int num =sc.nextInt();
    int arm=0,rem,temp=num;
    while(num>0){     //153>0 //153>0   //1>0 //0>0
        rem=num%10;  // rem =3  rem=5  rem=1
        num=num/10; //  num=15 num=1   num 0
        arm=arm+rem*rem*rem;
    }
        if(temp==arm) {
            System.out.println(temp + "it is Armstrong number");
        }
        else{
            System.out.println(temp+"it is not Armstrong number");
        }
    }
}