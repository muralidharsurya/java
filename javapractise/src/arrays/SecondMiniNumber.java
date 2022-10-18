package arrays;

public class SecondMiniNumber {
    public static void main(String[] args) {
        int a[]={2,23,43,34,5,7};
        int min=a[0],smin=a[0];
        for (int i =1;i<a.length; i++){
            if(a[i]<min){
                smin=min;
                min=a[i];
            } else if (a[i]>smin) {
                smin=a[i];

            }
        }
        System.out.println(min);
        System.out.println(smin);
    }
}
