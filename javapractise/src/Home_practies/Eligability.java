import java.util.Scanner;

public class Eligability {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of person ");
        int age = sc.nextInt();
         if ( 25<=age && age<=32){
             System.out.println(" Eligible  for job");
         }
         else{
             System.out.println("Not eligible for job");
         }
    }
}
