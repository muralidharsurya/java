package arrays;

public class SecondMaxNumber {
    public static void main(String[] args) {
        int a[]={2,23,43,34,5,7};
        int max=a[0],smax=a[0];
        for (int i =0;i<a.length; i++){
            if(a[i]>max){
                smax=max;
                max=a[i];
            } else if (a[i]>smax) {
                smax=a[i];

            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
