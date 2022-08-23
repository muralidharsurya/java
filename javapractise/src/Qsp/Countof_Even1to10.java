package Qsp;

public class Countof_Even1to10 {
    public static void main(String[] args) {
    int i=1,count=0;
    for (i=1;i<=10;i++){
        if (i%2==0){
            count++;
            System.out.println(i);

        }
    }
    System.out.println("Count of Even"+count);
}
}
