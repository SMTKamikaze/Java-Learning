import java.util.Scanner;

class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        String pigLatin = "";
        char ch = 'a';
        for (int i = 1; i < word.length(); i++) {
            ch = word.charAt(i);
            pigLatin = pigLatin + ch;
        }
        ch = word.charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            pigLatin = ch + pigLatin + "ay";
        } else {
            pigLatin = pigLatin + ch + "ay";
        }
        pigLatin = pigLatin.toLowerCase();
        System.out.println("The Pig Latin word is: " + pigLatin);
    }
}