package Patterns;

public class N6 {
    public static void main(String[] args) {
        int n=1;
        for (int row=1;row<=4
                ;row++){
            for(int col=1;col<=row;col++){
                System.out.print(n);
                n++;

            }
            System.out.println();
        }
    }
}
