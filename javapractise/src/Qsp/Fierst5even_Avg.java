package Qsp;

public class Fierst5even_Avg {
    public static void main(String[] args) {
        int i=1,count=0,sum=0;
        for (i=1;i<=10;i++){
            if (i%2==0){
                count++;
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("Count of Even"+count);
        System.out.println(sum);

        int avg =sum/count;
        System.out.println(avg);
    }
}
