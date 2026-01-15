public class Exceptions {
    public static void main(String[] args) {
        int result = 0;
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Line A
            int x = 10;
            int y = 0;
            System.out.println("HI HI HI");
            result = x / y; // Line B
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("CATCH 1 : " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("CATCH 2: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("CATCH 3: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program finished. Final result: " + result);
    }

}
