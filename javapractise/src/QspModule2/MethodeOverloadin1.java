package QspModule2;

public class MethodeOverloadin1 {
    public static void travel (String bustype,String source,String destination){
        System.out.println(bustype);
        System.out.println(source);
        System.out.println(destination);
    }
    public static void travel(String triantype,String source,String destination,int platform){
        System.out.println(triantype);
        System.out.println(source);
        System.out.println(destination);
        System.out.println(platform);
    }
    public static void travel(String flightname,String source,String destination,String typeofticket,int price){
        System.out.println(flightname);
        System.out.println(source);
        System.out.println(destination);
        System.out.println(typeofticket);
        System.out.println(price);
        System.out.println(destination);
    }

    public static void main(String[] args) {
        System.out.println("On Bus");
        travel("Ac Garuda","hyderabad","Vijayawada");
        System.out.println("*******************************");
        System.out.println("On train");
        travel("on Rajadhane Express","Hyderabad","guntur",2);
        System.out.println("*********************************");
        System.out.println("on flight");
        travel("Indian      Aireline","Hyderabad","USA","Bussines Class",100000);
    }


}
