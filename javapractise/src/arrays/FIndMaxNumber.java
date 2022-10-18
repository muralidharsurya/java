package arrays;

public class FIndMaxNumber {
    public static void main(String[] args) {
        int a[]={45,65,34,145,23,196};
//int max =a[0];
int min =a[0];
        for (int i=1;i<a.length;i++) {

            if (a[i]<min){           // minimum number
                min=a[i];

               /*  if (  a[i]>max){  // maximum number
                max = a[i];*/
            }
            }

        System.out.println(min);
        // System.out.println(max);
        }

    }

