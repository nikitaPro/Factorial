package factorial;

import java.math.BigInteger;

public class Factorial {
    
    public int reverseBigFactorial(BigInteger fac) {
        for (int i = 2; i <= 2000; i++) {
            BigInteger bigI = BigInteger.valueOf(i);
            if (fac.mod(bigI).compareTo(BigInteger.ZERO) == 1) break;
            
            fac = fac.divide(bigI);
            
            if (fac.compareTo(BigInteger.ONE) == 0) {
                return i;
            }
        }
        throw new ArithmeticException("Too big value or not a factorial value");
    }
    
    public int reverseFactorial(long fac) {
        for (int i = 2; i <= 2000; i++) {
            if (fac % i > 0) break;
            
            fac = fac / i;
            
            if (fac == 1) {
                return i;
            }
        }
        throw new ArithmeticException("Too big value or not a factorial value");
    }
}
