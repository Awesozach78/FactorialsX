/**
 * Created by Zachary on 11/8/2016.
 */
import java.util.Scanner;
class Factorials{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        int factorial = factorial(num);
        System.out.println("Factorial of entered number is: "+factorial);
    }
    static int factorial(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        output = factorial(n-1)* n;
        return output;
    }
}
