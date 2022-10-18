package arrays;

public class DeletingDuplicateNumber {
    public static void main(String[] args) {
                int a[]={23,2,63,9,36};
                for(int i=0;i<a.length;i++){
                    int tem;
                    for (int j=0;j<a.length-1;j++)
                    {
                        if(a[j]>a[j+1])
                        {
                            tem=a[j];
                            a[j]=a[j+1];
                            a[j+1]=tem;
                        }
                    }}
                int s=0;
                for (int k=0;k<a.length-1;k++){
                    if(a[k]==a[k+1]){
                    //    b[s]=a[k];
                    s++;
                }
                    //b[s]=a[a.length-1];


    }}}
