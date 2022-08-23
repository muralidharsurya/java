package Pavan;

public class Student {
    String  sname ;
    int id;
    char grade;
Student (int sid, char g,String name ) //constructor  creating
{
    id=sid;
    sname=name;
    grade=g;
}



    void getVaule(int sid, char g,String name){
        id=sid;
        sname=name;
        grade=g;

    }
    void display(){
        System.out.println(sname+" "+id+" "+grade);
    }
}
