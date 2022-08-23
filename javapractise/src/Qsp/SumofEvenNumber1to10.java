package Qsp;

public class SumofEvenNumber1to10 {
    public static void main(String[] args) {
            int count =0; int sum=0;
            for (int i=1;i<=10;i++){
                if(i%2==0){
                    count++;
                    sum=sum+i;
                }
            }
            System.out.println("sum is :"+sum);
        System.out.println(count);
        }
}
