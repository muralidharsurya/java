package Patterns2;

public class Pattern_X {
    public static void main(String[] args) {
            for(int row=1;row<=5;row++){
                for (int col=1;col<=5;col++){
                    if(row==col||row+col==6){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
    }
}
