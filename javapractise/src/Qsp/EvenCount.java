public class EvenCount {
    public static void main(String[] args) {
       int i=1, count=0;

        for (i=1;i<=15;i++)
        /*
        {
            if(i%2==0){
                System.out.println(i);
                
                count++;
            }

        }
        System.out.println("counting even number"+count);
*/


        for (i=1;i<=15;i++) // odd number
        {
            if(i%2!=0){
                System.out.println(i);

                count++;
            }

        }
        System.out.println("counting odd numbers"+count);

    }
}
