package Pavan;
public class MethodoverLoading {
    void add(int a,int b){  //1
        System.out.println(a+b);
    }
    void add(int a,double b){  //2
        System.out.println(a+b);
    }void add(int a,int b,int c){  //3
        System.out.println(a+b+c);
    }
    void add(int a,int b, double c){ //4
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        MethodoverLoading mo = new MethodoverLoading();
        mo.add(23, 34);//1
        mo.add(25, 4.5);//2
        mo.add(3,25,5);//3
        mo.add(2,4,3.5);//4
    }

}

