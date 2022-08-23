package Qsp;

public class Palindromnum1to1000 {
    public static void main(String[] args) {
        for (int num=1;num<=1000;num++){
            int rem,rev=0,temp=num;
            while(temp>0){
                rem=temp%10;
                temp=temp/10;
                rev=rev*10+rem;
            }
            if ( num==rev)
                System.out.println(num+"is Palindrome number" );
        }
    }


}
