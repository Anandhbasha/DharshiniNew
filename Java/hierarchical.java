class Dad {
    void display() {
        System.out.println("This is the parent class.");
    }
}
class son extends Dad {
    
}
class daughter extends Dad {
    
}
public class hierarchical {
    public static void main(String[] args) {
        son s = new son();
        s.display();
        daughter d = new daughter();
        d.display();
    }
}
