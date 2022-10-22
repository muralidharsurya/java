package arrays;

public class Addtion2DArray {
    public static void main(String[] args) {
        int a[][]={{10, 20},
                    {30,40}};
        int b[][]={{50,60},{70,80}};
        int c[][]=new int[a.length][b.length];
        for(int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int k=0; k<c.length;k++){
            for (int l=0;l< c.length;l++){
                System.out.print(c[k][l]+" ");
            }
            System.out.println();
        }
}}
