package QspModule2;

public class Employee {
     String ename,empdesg;
     String empid;
     int  empsalary;
     public Employee( String name, String desg,String id,int salary
      ){
          ename=name;
          empdesg=desg;
          empid=id;
          empsalary=salary;
     }
     public static void main(String[] args) {
          Employee e1=new Employee("Surya","QA","4323",300000);
         System.out.println("name:  "+" " + e1.ename+ "designation:  "+  e1.empdesg+"employee id:  "+e1.empid+  "salary:   "+e1.empsalary);
         Employee e2= new Employee("Raju","Devops","2423",2423144);
         System.out.println("name:  "+" " + e2.ename+ "designation:  "+  e2.empdesg+"employee id:  "+e2.empid+  "salary:   "+e2  .empsalary);
     }


}
