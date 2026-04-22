class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class constructor {
    public static void main(String[] args) {
        Student s = new Student("John", 20);
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        Student s2 = new Student("Alice", 22);
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);

    }
}
