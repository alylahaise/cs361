/**
 * @author Alyssa Lahaise
 *
 */

class Fibonacci {

// returns the n'th Fibonacci number
// parameter: int between 0 and 46
    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("input must be greater than or equal to 0");
        }
        else if (n > 46) {
            throw new IllegalArgumentException("function will return incorrect results for inputs greater than 46");
        }
        else if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    

    public static void main(String[] args) {
        
        for (int i = 0; i <= 101; i++) {
            System.out.println("The fib of " + i + " is: " + fib(i));
        }
       
    }        


}