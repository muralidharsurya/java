package QspModule2;

public class Table {
    public static void tablemMultiple(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }

    public static void main(String[] args) {
        tablemMultiple(7);
        System.out.println("   ");
       // tablemMultiple(6);
    }
}
