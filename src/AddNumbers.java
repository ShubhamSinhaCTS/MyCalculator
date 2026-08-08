/**
 * AddNumbers - A utility class to add two numbers of any numeric format
 * Supports: int, long, float, double, and other numeric types
 */
public class AddNumbers {

    /**
     * Adds two integers
     * @param num1 First integer
     * @param num2 Second integer
     * @return Sum of the two integers
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Adds two long numbers
     * @param num1 First long number
     * @param num2 Second long number
     * @return Sum of the two long numbers
     */
    public static long add(long num1, long num2) {
        return num1 + num2;
    }

    /**
     * Adds two float numbers
     * @param num1 First float number
     * @param num2 Second float number
     * @return Sum of the two float numbers
     */
    public static float add(float num1, float num2) {
        return num1 + num2;
    }

    /**
     * Adds two double numbers
     * @param num1 First double number
     * @param num2 Second double number
     * @return Sum of the two double numbers
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Main method to demonstrate the add functionality
     */
    public static void main(String[] args) {
        // Adding integers
        int intResult = add(10, 20);
        System.out.println("Addition of integers (10 + 20): " + intResult);

        // Adding long numbers
        long longResult = add(100000000L, 200000000L);
        System.out.println("Addition of longs (100000000 + 200000000): " + longResult);

        // Adding float numbers
        float floatResult = add(10.5f, 20.3f);
        System.out.println("Addition of floats (10.5 + 20.3): " + floatResult);

        // Adding double numbers
        double doubleResult = add(15.75, 25.25);
        System.out.println("Addition of doubles (15.75 + 25.25): " + doubleResult);
    }
}
