import java.util.Scanner;

class testing {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      int l = name.length();
      int c;
      c = 0;
      int i;
      for (i = 0; i < l;i++) {
         char ch = name.charAt(i);

         if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
               || ch == 'o' || ch == 'u')
            System.out.print("First Vowel is at " + i);
         c++;
         break;
      }
      if (c == 0)
         System.out.println("No vowels");
   }
}