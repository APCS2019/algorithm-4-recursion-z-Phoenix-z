public class Recursion{
   //part1: factorial non-recursion

   
   //part2: factorial recursion
      public class recursion {
    public static void rec(int n) {

        if (n == 1) {
            return;
        }
        rec(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial((n - 1));
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
    }
}
   
   
   //part3: fibonacci sequence non-recursion
   
   
   
   //part4: fibonacci sequence recursion
   public class Fibo {
    public static int fibonacci(int n) { // fibonacci sequence
        if (n == 1 || n == 0) { // fibonacci sequence
            return 1; // fibonacci sequence
        } // fibonacci sequence
        return fibonacci((n - 1) + fibonacci((n - 2))); // fibonacci sequence
    } // fibonacci sequence
      // fibonacci sequence

    public static void main(String[] args) {
        System.out.println(fibonacci((20)) / (double) fibonacci(21));
    }
}

}
