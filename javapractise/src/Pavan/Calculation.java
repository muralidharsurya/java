package Pavan;

public class Calculation {
    int x= 10;
    int y=20;
   /* void sum()// case-1 not taking parameter and also not returned any value
    {
        System.out.println(x+y);
    }*/
   /*int sum()// case-2 not taking parameter but returned any value{
   {
       return(x + y);
   }*/

  /*  void sum( int a,int b)// case-3  taking parameter and also not returned any value
    {
        System.out.println(a+b);
    }*/

    int sum(int a, int b)// case-4 taking parameter and also  returned a value
    {
        return(a+b);
    }

    public static void main(String[] args) {
        Calculation cal=new Calculation();
      //  cal.sum(); // case1

      /*   int res=cal.sum();// case2
        System.out.println(res);

        System.out.println(cal.sum());
        */
      // cal.sum(100,200); // c ase 3

        System.out.println(cal.sum(100,200)); // case4

    }


}

