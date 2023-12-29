import java.util.Scanner;
class testing
{
public static void main(String[] args)
{
  int vowels = 0;
  int digits = 0;
  int aplha = 0;
  int l;
  int special = 0;
  int small = 0;
  int capital = 0;
  int total_no_words = 0;
  System.out.println("Enter a string: ");
  Scanner sc = new Scanner(System.in);
  String St = sc.nextLine();
  for (int i = 0; i < St.length(); i++) {
    char ch = St.charAt(i);
    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
      vowels++;
    if ((int)ch >= 0 && (int)ch <= 9)
      digits++;
    if ((int)ch >= 65 && (int)ch <= 90)
      capital++;
    if ((int)ch >= 97 && (int)ch <= 122)
      small++;
    if (((int)ch >= 65 && (int)ch <= 90) || ((int)ch >= 97 && (int)ch <= 122))
      aplha++;
    if (ch == ' ')
      total_no_words++;
  }
  total_no_words++;
  System.out.println("Number of vowels = " + vowels);
  System.out.println("Number of digits = " + digits);
  System.out.println("Number of aplha = " + aplha);
  System.out.println("Number of small = " + small);
  System.out.println("Number of capital = " + capital);
  System.out.println("Total no of words = " + total_no_words);
  special = St.length() - (total_no_words + digits + aplha);
  special--;
  if (special < 0)
  special = 0;
  System.out.println("Total no of special characters = " + special);
}

}
//Shivansh is god of the universe
// number of words = Total_spaces + 1