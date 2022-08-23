package Pavan;

public class OverloadingMainMethod {
    public  static  void main(int x) { //1
        System.out.println(x);
    }

    public static void main(int x, int y) { //2
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        OverloadingMainMethod om = new OverloadingMainMethod();
        main(100); //1
        main(100,344);//2
    }
}
