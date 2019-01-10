package factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter n! = ");
        Scanner input = new Scanner(System.in);
        Factorial fac = new Factorial();
        int res = 0;
        
        try {
            if (input.hasNextLong()) {
                long l = input.nextLong();
                input.close();
                res = fac.reverseFactorial(l);
            } else if (input.hasNextBigInteger()) {
                BigInteger bigInt = input.nextBigInteger(); 
                input.close();
                res = fac.reverseBigFactorial(bigInt);
            } else {
                System.out.print("Unexpected input symbol.");
                input.close();
                System.exit(1);
            }
        } catch (ArithmeticException e) {
            System.out.print(e.getMessage()); 
            System.exit(2);
        }
        
        System.out.print("n = " + res);
    }
    
}
