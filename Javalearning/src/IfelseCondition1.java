import java.util.Scanner;

public class IfelseCondition1 {
    public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();

            int  max=a;
            if (max<=b){
                System.out.println("he get pass marks");
            } else if (max>=c) {
                System.out.println("he get fail marks");
            }
            else {
                System.out.println("invalid marks");
            }


    }
}
