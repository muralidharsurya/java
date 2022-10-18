package arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int a[]={23,2,63,9,36};
        for(int i=0;i<a.length;i++){
            int tem;
            for (int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1]) // ascending order
                //if(a[j]<a[j+1]) // descending order
                {
                 tem=a[j];
                 a[j]=a[j+1];
                 a[j+1]=tem;


            }
        }
    }
        for (int k=0;k< a.length;k++)
            System.out.println(a[k]);
}}
