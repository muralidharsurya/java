package Qsp;

public class Sum_greterthan25 {
    public static void main(String[] args) {

        int i=1, count =0; int sum=0;
        for( i=1;i<=10;i++){
            count++;
            sum=sum+i;
        }
        System.out.println(sum);
        System.out.println(count);
        if(sum>25){
            System.out.println("sum is greater than 50");
        }
        else {
            System.out.println("sum is less than 50");
        }

    }
}
