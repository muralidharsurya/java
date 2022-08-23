package QspModule2;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Area {
    public static void areaTri( int h ,int b){
        float area=0.5f*h*b;
        System.out.println(area);
    }
      public static void areaRect(int l,int b){
        int area=l*b;
          System.out.println(area);
       }
       public static void areasuq(int s){
        int area=s*s;
           System.out.println(area);
       }
       public static void circle(int r){
        float area=3.14f*r;
           System.out.println(area);
       }

    public static void main(String[] args) {
        areaTri(12,32);
        areaRect(20,10);
        areasuq(10);
        circle(5);


    }


}
