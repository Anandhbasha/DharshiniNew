abstract class Bank{
    abstract void Intrest();
}
class SBI extends Bank{
    void Intrest(){
        System.out.println("Intrest is 5%");
    }
}
class HDFC extends Bank{
    void Intrest(){
        System.out.println("Intrest is 6%");
    }
}
public class abstraction {
    public static void main(String[] args) {
        SBI s = new SBI();
        s.Intrest();
        HDFC h = new HDFC();
        h.Intrest();
    }
}
