public class lamFunction {
    public static void main(String[] args) {
        Square square = (int x) -> x * x;
        int result = square.calculate(5);
        System.out.println("Square of 5 is: " + result);
    }
}
@FunctionalInterface
interface Square { 
    int calculate(int x);
}