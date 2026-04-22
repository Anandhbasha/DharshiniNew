class Employee{
    void salary(){
        System.out.println("Employes salary ");
    }
}
class Developer extends Employee{
    @Override
    void salary(){
        System.out.println("Developer salary is 30000");
    }
}
class Manager extends Employee{
    @Override
    void salary(){
        System.out.println("Manager salary is 50000");
    }
}

public class overridding {
    public static void main(String[] args) {
     Employee emp1 = new Employee();   
     Employee dev = new Developer();   
     Employee mgr = new Manager();  
        emp1.salary();  
        dev.salary();
        mgr.salary(); 
    }    
}
