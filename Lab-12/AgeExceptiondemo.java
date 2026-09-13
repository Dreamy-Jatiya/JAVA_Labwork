//4. Write a Java program that divides two numbers.  If Num1 or Num2 were not an integer, the program would 
// throw a Number Format Exception. If Num2 were Zero, the program would throw an Arithmetic Exception. 
// Display appropriate message for each exception. [B] 
import java.util.Scanner;

public class AgeExceptiondemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter First no.(Num1) : ");
            String num1Str=sc.nextLine();
            System.out.println("Enter Second no.(Num2) : ");
            String num2Str=sc.nextLine();

            int num1=Integer.parseInt(num1Str);
            int num2=Integer.parseInt(num2Str);

            int result=num1/num2;
            System.out.println("Result = "+result);
        }
        catch(NumberFormatException e){
            System.out.println("Error:Please  enter valid Interger numbers only");
        }
        catch(ArithmeticException e){
            System.out.println("Error : cannot divide by zero");
        }
        sc.close();
    }
}
