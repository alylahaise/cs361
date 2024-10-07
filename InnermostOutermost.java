class InnermostOutermost {

    public static int f(int n, int m) {
        if (m < 0) {
            throw new IllegalArgumentException("m should be greater than or equal to 0");
        }
        if (n==0) {
            return 0;
        }
        else {
            return f(n-1, f(n, m));
        }
    }

    public static void main(String[] args) {
        try {
            f(1, 1); 
            System.out.println("Function terminates, so uses outermost");
        }
        catch (StackOverflowError ex) {
            System.out.println("Function does not terminate, so uses innermost"); // function does not terminate, so uses innermost
        }
        
    }
}