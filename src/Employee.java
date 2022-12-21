public class Employee {
    int salary= 100000;
}

//Inherit supervisor class from employee class
class Supervisor extends Employee{
    int bonus= 30000;

    public static void main(String[] args) {
        Supervisor s=new Supervisor();
        System.out.println("Supervisor salary is: "+s.salary);
        System.out.println("Supervisor bonus is: "+s.bonus);

        int grossSal=s.salary+s.bonus;
        System.out.println("Manager gross salary is: "+grossSal);
    }
}
