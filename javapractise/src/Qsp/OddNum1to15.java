package Qsp;

public class OddNum1to15 {
    public static void main(String[] args) {
        int i=1,count=0;
        for (i=1;i<=15;i++){
            if (i%2!=0){
                count++;
                System.out.println("odd number :"+i);


            }
        }
        System.out.println(count);
    }
}

