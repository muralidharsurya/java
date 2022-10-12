package methodeOverriding;

class Zomato{
public void getRestaurant() {
  System.out.print("Acess to location");
  
}
}
class ZomatoUser extends Zomato{
	public void restaurant() {
		System.out.print("Acc to rating and reviews");  		
	}
	
}

public class User {
	public static void main(String[] args) {
		Zomato z=new Zomato();
		z.getRestaurant();
		ZomatoUser z1 =new ZomatoUser();
		z1.getRestaurant();
		

	
	}
}

