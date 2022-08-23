public class PrimeNumber1 {
    public static void main(String[] args) {
        int count = 0;
        int n = 12;
        if (n == 2) {
            System.out.println(n + "is a prime number");
        } else {
            for (int j = 1; j <= n; j++) {
              for (int i = 1; i <= j; i++) {
                    if (j % i == 0) {
                        count = 1 + count;
                    }
                    if (count == 2) {
                        System.out.println(j);
                    }
                }
            }
        if (count == 2) {
            System.out.println(n+"PrimeNumber");
        }
        else{
            System.out.println(n+" NotPrime Number");
        }
        }
    }
}
