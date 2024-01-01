import java.util.Scanner;

class testing {
    // The goal is to make a program to print all the twin primes. between a given
    // range. that's for now. I am still learning,
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the ending range: ");
        int num2 = sc.nextInt();

        int i = 0;
        i = num1;
        for (i = num1; i < num2; i++) {
            if (isTwinPrime(i, i + 2))
                System.out.println(i + "--" + (i + 2));
        }

    }

    static boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                c++;
        }
        if (c == 1)
            return true;
        else
            return false;
    }

    static boolean isTwinPrime(int n, int m) {

        if (isPrime(n) && isPrime(m))
            return true;
        else
            return false;
    }
}
// use code assistants, like github copilot or Cody but carefully.