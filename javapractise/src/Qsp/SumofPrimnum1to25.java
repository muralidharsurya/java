package Qsp;

public class SumofPrimnum1to25 {
    public static void main(String[] args) {
        int sum =0;

        for (int i=1;i<=25;i++){
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;

                }
            }
            if(count==2){
                System.out.println(i);
                sum=sum+i;
            }
         }
        System.out.println(sum);
    }
}

