package Qsp;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter charecter");
      char ch=sc.next().charAt(0);
      /*  switch(ch){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
                System.out.println("smaller vowel");
                break;
            case'A':
            case'E':
            case'I':
            case'0':
            case'U':
                System.out.println("CAPITAL VOWEL");
                break;





        }*/

        if(ch=='e') {
            System.out.println("small vowell");
        } else if (ch=='a') {
            System.out.println("small vowell");
        }
        else if(ch=='i'){
            System.out.println("small vowell");
        }
        else {
            System.out.println("invalid");
        }
    }
}
