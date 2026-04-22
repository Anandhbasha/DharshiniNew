class GrandParent {
    void display() {
        System.out.println("I am the grandparent.");
    }
}
class Parents extends GrandParent {
    
}
class Child extends Parents {
    
}
public class multilevel {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
