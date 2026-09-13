// 1. Write a program to demonstrate Arithmetic Exception and
//    ArrayIndexOutOfBounds Exception using try-catch block. [A]

public class Exception {
    public static void main(String[] args) {

        // Arithmetic Exception
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e);
        }

        // ArrayIndexOutOfBounds Exception
        try {
            int arr[] = { 1, 2, 3 };
            System.out.println("Array Element = " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e);
        }
    }
}