package Patterns;

public class p17 {
    public static void main(String[] args) {
        int star =1,space=3;
        for(int i=7;i>=1;i--){
            for(int j=7;j>=1;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++){
                System.out.print("*");
            }
            if(i<=3){
                star=star+1;
                space=space-1;
            }
            else{
                star=star-1;
                space=space+1;
            }
            System.out.println();
        }
    }
}


