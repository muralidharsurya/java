package Qsp;

public class Armstrong1to1000 {
    public static void main(String[] args) {
        for(int num=1;num<=1000;num++){
            int rem,arm=0 ,temp=num;
            while(temp>0){
                rem=temp%10;
                temp=temp/10;
                arm=arm+rem*rem*rem;

            }
            if(num==arm)
                System.out.println(num+"is it Armstrong number");
        }
    }
}
