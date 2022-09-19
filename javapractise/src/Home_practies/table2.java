import java.util.Scanner;

public class table2 {

    public static void main(String[] args) {
        int number, range;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input value");
        number = sc.nextInt();
        //System.out.println("enter range");
        //range = sc.nextInt();
        int i = 1;
        switch (number) {
            case 1:
            while (i <= 10) {
                i++;
                System.out.println(number + "*" + i + "=" + number * i);
            }
            break;
            case 2:
                while (i <= 10) {
                    i++;
                    System.out.println(number + "*" + i + "=" + number * i);
                }
                break;
            case 3:
                while (i <= 10) {
                    i++;
                    System.out.println(number + "*" + i + "=" + number * i);
                }
                break;
            default:
                System.out.println("enter value up");
        }

    }
}
