
import java.util.Scanner;

class abc {
    // Write a program in Java to accept a name(Containing three words) and display
    // only the initials (i.e., first letter of each word).
    // Sample Input: LAL KRISHNA ADVANI
    // Sample Output: L K ADANI
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        name = name.toUpperCase();
        name = name.trim();
        int i = 0;
        String word = "";
        String initial = "";

        for (i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch != ' ')
                word = word + ch;
            if (ch == ' ') {
                initial = initial + " " + word.charAt(0);
                word = "";
            }
        }
        initial = initial + " " + word;
        initial = initial.trim();
        System.out.println(initial);
    }
}