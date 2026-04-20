class Parent {
    String preoperty ="Home";
}
class Son extends Parent{
    void display(){
        System.out.println("Property is "+preoperty);
    }
}
public class SimpleInhertence {
    public static void main(String[] args) {
        Son s =new Son();
        s.display();

    }
}
