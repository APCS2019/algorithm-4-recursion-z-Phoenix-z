public class Recursion{
   //part1: factorial non-recursion
   public static void rec(int n){ 
     int a = 1;
        for (int i = 1; i < n+1; i++) {
            a *= i;
        }
        return a;
   }
   //part2: factorial recursion
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial((n - 1));
    }
   //part3: fibonacci sequence non-recursion
   public static int fibonacci1(int n) {
        int a = 1;         
        int b = 1;
        for (int i = 0; i < n; i++) {
             if (i > 2) {
               int temp = b;
               b += a;
               a += temp;
            }
        }
        return a+b;
    }
   //part4: fibonacci sequence recursion
    public static int fibonacci(int n) {
        if (n == 1 || n == 0) { 
            return 1; 
        } 
        return fibonacci(n - 1) + fibonacci(n - 2); 
    } 
