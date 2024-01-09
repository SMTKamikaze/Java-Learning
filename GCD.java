import java.util.Scanner;

class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        int r = num1 % num2;
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        while (num1 % num2 != 0) {
            num2 = num1 % num2;
        }
        System.out.println("GCD: " + num2);
    }
}