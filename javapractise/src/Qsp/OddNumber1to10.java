public class OddNumber1to10 {
    public static void main(String[] args) {
        int a = 50;

        for (a = 1; a < 50; a++) {
            if (a % 2 == 0) {
                System.out.println( "even number "+ a);
            }
            else
            {
                System.out.println("odd number "+a);
            }
        }
    }
}
