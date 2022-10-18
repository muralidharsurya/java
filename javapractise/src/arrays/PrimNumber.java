package arrays;

public class PrimNumber {
    public static void main(String[] args) {
        int a[]={2,4,3,5,8};
        int len=a.length;

        for(int i=0;i<len;i++){
            int count=0;  // every number count start with zero
            for (int j=1;j<=a[i];j++){
            if(a[i]%j==0){
                count++;
            }
        }
        if(count==2)
            System.out.println(a[i]+" Prime Number");
             else
            System.out.println("prime Numer not");


    }}}

