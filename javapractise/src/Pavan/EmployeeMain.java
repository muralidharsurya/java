package Pavan;

public class EmployeeMain {
    public static void main(String[] args) {
        Eployee emp1= new Eployee();  // create object
        emp1.eid=108;
        emp1.ename="divid";
        emp1.sal=300000.00;
        emp1.deptno=4;
        emp1.job="tester";
        emp1.display();

        Eployee emp2= new Eployee();
        emp2.eid=104;
        emp2.ename="ivid";
        emp2.sal=300244.00;
        emp2.deptno=5;
        emp2.job="mngr";
        emp2.display();


    }
}
