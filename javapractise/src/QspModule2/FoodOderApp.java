package QspModule2;

import Pavan.FinalVariableD;

public class FoodOderApp {
    static String restaurant_name ="Swagath Garden";
    static   int no_of_dishes_oreder=6;
     static int price = 3000;
     String oder_id ="ORID130401SF";
     int discount_amt= 250;
      static void oder_details(){
          System.out.println("restaurant_name:"+restaurant_name);
          System.out.println("price:"+price);
          System.out.println("no_of_dishes_oreder:"+no_of_dishes_oreder);
          FoodOderApp fp=new FoodOderApp();
          System.out.println("oder_id:"+fp.oder_id);
          System.out.println("discount_amt:"+fp.discount_amt);
      }
      void delivery_person(String address,int wait_charges){
          System.out.println("address:"+address);
          System.out.println("wait_charges:"+wait_charges);
      }
      void zomato_partner(){
          int food_rating=3;
          int delivery_rating=4;
          int hygenic_rating=2;
          System.out.println( "food_rating:"+food_rating);
          System.out.println("delivery_rating:"+hygenic_rating);
          delivery_person("kndpr",456);
          System.out.println(delivery_rating );

      }

    public static void main(String[] args) {

        oder_details();
        FoodOderApp fa= new FoodOderApp();
        fa.zomato_partner();

    }

}
