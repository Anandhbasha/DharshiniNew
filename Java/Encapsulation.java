class BankAccount{
    private double balance= 1000;
    
    void deposit(int amount){
        if(amount>100){
            balance += amount;
            // balance = balance+amount;
            System.out.println(balance);
        }
    }
    void withdraw(int amount){
        if(amount>100){
            balance -= amount;
            // balance = balance+amount;
            System.out.println(balance);
        }
    }
    double checkBalance(){
        return balance;
    }
}
public class Encapsulation {
    public static void main(String[] args){
        BankAccount acc = new BankAccount();
        System.out.println(acc.checkBalance());
        acc.deposit(5000);
        acc.withdraw(800);
        System.out.println(acc.checkBalance());
    }
}
