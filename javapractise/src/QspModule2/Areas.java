package QspModule2;

public class Areas {
    static int length=10;
    static int breadth=5;
    static int height=6;
    static int radius=8;
    static float pie=3.14f;

    public static void areaReactangl(){
        float ares= length*breadth;
        System.out.println(ares);

    }
        static void areaTrangle()
        {
        double area=0.5*height*breadth;
        System.out.println(area);
        }
        static void areaCircle()
        {
        double area =pie*radius*radius;
            System.out.println(area);
        }



    public static void main(String[] args)
    {
        areaReactangl();
        areaTrangle();
        areaCircle();
    }

}
