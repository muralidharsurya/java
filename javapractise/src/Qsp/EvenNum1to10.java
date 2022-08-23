package Qsp;
// count  of even num from 1 to 10
public class EvenNum1to10 {
    public static void main(String[] args) {
        int count =0; int sum=0;

     /*   for (int i=1;i<=10;i++){
            if(i%2==0){
                sum=sum+i;
               count++;

                System.out.println(i);

            }
        }
        System.out.println("count is:"+count);


    }*?/
  /* public static void main(String[] args) {  // even num product from1 to 5
            int  sum=1;

            for (int i=1;i<=10;i++){
               if(i%2==0){
                   sum=sum*1;
               }
            }
       System.out.println(sum);*/
        float avg;
        for (int i=1;count<=5;i++)
        { if ( i%2==0) {
            count++;
            sum = sum + i;
        }
        }
        float any=sum/count;
        System.out.println("avg");
        System.out.println("sum");

        System.out.println(any);
   }
}


