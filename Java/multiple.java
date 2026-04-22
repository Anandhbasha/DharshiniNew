interface LoanService {
    void applyloan();
}
interface InsuranceService {
    void insurance();
}
class bank implements LoanService, InsuranceService {
    public void applyloan() {
        System.out.println("Applying for a loan...");
    }
    public void insurance() {
        System.out.println("Providing insurance services...");
    }
}
public class multiple {
    public static void main(String[] args) {
        bank myBank = new bank();
        myBank.applyloan();
        myBank.insurance();        
    }
}
