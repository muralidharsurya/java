package Qsp;

public class ProductofEven1to10 {

        public static void main(String[] args) {
            int count =0; int sum=1;
            for (int i=1;i<=10;i++){
                if(i%2==0){
                    sum=sum*i;
                    count++;
                }

            }
            System.out.println("product :"+sum);
            System.out.println(count);
        }
}

