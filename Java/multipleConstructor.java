class Demo{
    Demo(){
        System.out.println("This is default constructor");
    }
    Demo(String name){
        System.out.println("This is parameterized constructor with name: " + name);
    }
    Demo(int age,String name){
        System.out.println("This is parameterized constructor with age: " + age + " and name: " + name);
    }
}
public class multipleConstructor {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo("John");
        Demo d3 = new Demo(20, "Alice");
    }
}
