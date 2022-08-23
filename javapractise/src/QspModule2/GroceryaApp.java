package QspModule2;

public class GroceryaApp {
    static String intemname="Watch";
    static String brand_name= "Rolex";
    int amount=2000;
    int quantity=5;
    public static void customer_order(){
        System.out.println(intemname);
        System.out.println(brand_name);
        GroceryaApp ap=new GroceryaApp();
        System.out.println(ap.amount);
        System.out.println(ap.quantity);
     }
     public void delivery_partners(){
        int mask_charge=10;
        int sanitise_charge=150;
         System.out.println(mask_charge);
         System.out.println(sanitise_charge);
     }
    public static void main(String[] args) {
        customer_order();
        GroceryaApp gp=new GroceryaApp();
        gp.delivery_partners();
    }
}
