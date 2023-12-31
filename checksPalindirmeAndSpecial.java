import java.util.Scanner;
class testing
{
    public static void main(String[] args)
    {
        char char1= 'A';
        char char2= 'A';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name ="";
        name = sc.nextLine();
        int l=name.length();
        String reversed="";
        for(int i=0;i<l;i++)
        {
            char ch = name.charAt(i);
            reversed=ch+reversed;
        }
        char1=reversed.charAt(0);
        char2=name.charAt(0);
        if(name.equals(reversed))
        System.out.println("Palindrome");
        else if(char1==char2)
        System.out.println("Special");
    }

            
}