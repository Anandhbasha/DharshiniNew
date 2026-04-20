class Payment{
    void Pay(int amount){
        System.out.println("Payment of "+amount+" is done by Cash");
    }
    void Pay(int amount,String upiid){
        System.out.println("Payment of "+amount+" is done by Gpay");
    }
    void Pay(int amount,String cardno,String cvv){
        System.out.println("Payment of "+amount+" is done by Card");
    }
}
public class overloading {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.Pay(500);
        p.Pay(1000,"abc@upi");
        p.Pay(2000,"1234-5678-9012-3456","123");
    }
    
}
