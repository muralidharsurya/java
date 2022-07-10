import java.util.Scanner;

public class IfelseCondition1 {
    public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();


            int  min=a;
            if (min<=b){
                System.out.println("he get pass marks");
            } else   {
                System.out.println("he get fail marks");
            }

    }
}
