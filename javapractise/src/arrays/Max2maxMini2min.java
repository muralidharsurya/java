package arrays;

public class Max2maxMini2min {
    public static void main(String[] args) {
                int a[] = {23, 2, 63, 9, 36};
                for (int i = 0; i < a.length; i++) {
                    int tem;
                    for (int j = 0; j < a.length - 1; j++) {
                        if (a[j] > a[j + 1]) // ascending order
                        //if(a[j]<a[j+1]) // descending order
                        {
                            tem = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = tem;
                        }
                    }
                }
        System.out.println("maximum Number:"+a[a.length-1]);
        System.out.println("minimum Number:"+a[a.length- a.length]);
        System.out.println("second maximum number:"+a[a.length-2]);
        System.out.println("second minimum Number:"+a[a.length-(a.length-2)]);
            }
        }


