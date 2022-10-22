package arrays;

public class PassAnArray {
    public static void display(int s[],String str[]){
        for (int j=0;j<s.length;j++){
            System.out.println(s[j]+"-"+str[j]);
        }
    }

    public static void main(String[] args) {
        int a[]={100,1001,1002,10003,1004};
        String s[]={"java","j2ee","springboot","python","datastructre"};
        display(a,s);
    }
}
