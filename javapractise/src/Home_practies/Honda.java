

class Vehicle {
    void Herohonda (){
        System.out.println(" thise is vehicle class");

    }
}
 class Honda extends Vehicle {
    void wheels() {
        System.out.println("thise is honda class");
    }


}
class Hero extends Honda{
    void doors(){
        System.out.println("this id hero class");

    }
    public static void main(String[] args) {

        Hero H=new Hero();
        H.doors();
        H.Herohonda();
        H.wheels();

    }
}
