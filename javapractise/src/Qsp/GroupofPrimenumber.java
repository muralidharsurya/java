package Qsp;

import java.util.Scanner;

public class GroupofPrimenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fromnum = sc.nextInt();
        int tonum = sc.nextInt();
        for (int i = fromnum; i <= tonum; i++)
        {
            int count = 0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i+" primenumber");
            }
        }
    }
}

