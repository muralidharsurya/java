public class MethodeOverLoading {
  static int addition( int a, int b ){
        return a+b;
    }
   /* static void addition( long a , int b ) //different type of parameters
      // static long  addition(long a,int b)
    {
        System.out.println(a+b);
       // return a+b;
    }*/

   static String addition( ){
        return "addition";
    }
     static float  addition(float d ,float e, float c){
        return  d+e+c;
    }
    public static void main(String[] args) {
           MethodeOverLoading ml= new MethodeOverLoading();
           ml.addition(24,3);
      //     MethodeOverLoading ml2= new MethodeOverLoading();
        System.out.println(   ml.addition(3.6f,5.76f,6.55f));
           ml.addition();
    }
}
