public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred:" );
        }
    }
}
