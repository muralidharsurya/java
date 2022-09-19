import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  age of a person");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println(" he is eligible for votting");
        }
        else {
            System.out.println("he  not is eligible for votting");
        }
    }
}
