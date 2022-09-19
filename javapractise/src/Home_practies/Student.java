public class Student {
    void show (){
        System.out.println("learning java");}
}
class Job extends Student{
    void working(){
        System.out.println("working somthing");
    }
}
class inheritance{
    public static void main(String[] args) {
        Job j=new Job();// child class declaration
        Student S=new Student();//parent object declaration
        S.show();
       // S.working(); chaild class methode can't called with parent class object
        j.working();
        j.show();

    }
}