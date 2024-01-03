import java.util.Scanner;

class testing {
    // The goal is to make a program to print all the twin primes. between a given
    // range. that's for now. I am still learning,: 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the ending range: ");
        int num2 = sc.nextInt();

        int i = 0;
        int d=0;
        i = num1;
        for (i = num1; i < num2; i++) {
            if (isTwinPrime(i, i + 2))
                {
                    System.out.println(i + "--" + (i + 2));
                    d++;
                }
        }
        System.out.println("Total number of twin primes: "+d);
    }

    static boolean isPrime(int n) {
         if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        // Check for prime using 6k +/- 1 optimization
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isTwinPrime(int n, int m) {

        if (isPrime(n) && isPrime(m))
            return true;
        else
            return false;
    }

    
}