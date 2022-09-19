package inheritance;

 class Vjit {
    String firstname, lastname;
    String dateofjoining;
    char section;
    boolean clgtransport;

    Vjit(String firstname, String lastname, String dateofjoining, char section, boolean clgtransport) {
        this.firstname = firstname;
        this.clgtransport = clgtransport;
        this.dateofjoining = dateofjoining;
        this.lastname = lastname;
        this.section = section;
    }
 }
    class Students extends Vjit {
       String bike;


        Students(String firstname, String lastname, String dateofjoining, char section, boolean clgtransport,String bike) {
            super(firstname, lastname, dateofjoining, section, clgtransport);
             this.bike=bike;
        }

       /* void stu() { // dont do thise

            firstname = "Surya";
            clgtransport = true;
            lastname = "Ravi";
            section = 'A';
            dateofjoining = "13-FEb-2021";
        }*/
    }

    public class RunVjit {
        public static void main(String[] args) {
            Students ravi = new Students("suura","ravi","10thjun",'a',true,"hero");
            System.out.println(ravi.firstname);
            System.out.println(ravi.lastname);
            System.out.println();


        }
}




