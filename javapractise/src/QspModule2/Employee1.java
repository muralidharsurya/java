package QspModule2;

public class Employee1 {  // using this key word
    String ename,empdesg;
    String empid;
    int  empsalary;
     Employee1( String ename, String empdesg,String empid,int empsalary)
    {
        this.ename=ename;
        this.empdesg=empdesg;
        this.empid=empid;
       this.empsalary=empsalary;
    }
    public static void main(String[] args) {
        QspModule2.Employee e1=new QspModule2.Employee("Surya","QA","4323",300000);
        System.out.println("name:  "+" " + e1.ename+ "designation:  "+  e1.empdesg+"employee id:  "+e1.empid+  "salary:   "+e1.empsalary);
        QspModule2.Employee e2= new QspModule2.Employee("Raju","Devops","2423",2423144);
        System.out.println("name:  "+"" + e2.ename+ "designation:  "+  e2.empdesg+"employee id:  "+e2.empid+  "salary:   "+e2  .empsalary);
    }


}


