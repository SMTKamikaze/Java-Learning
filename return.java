import java.util.Scanner;
class Return
{
    public static void main(String[] args) 
    {
     Scanner sc =new Scanner(System.in);
     System.out.println("Enter: ");
     int num=sc.nextInt();

     if(isPalindrome(num))
     System.out.println("Palindrome");
    }




    public static boolean isPalindrome(int num)
    {
        int temp=num;
        int rev=0;
        while(num>0)
        {
            int lastDigit=num%10;
            rev=rev*10+lastDigit;
            num=num/10;
        }
        if(temp==rev)
        return true;
        else
        return false;
    }
}