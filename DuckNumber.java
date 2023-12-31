import java.util.Scanner;
class abc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int r=0;int d=0;
        int c=0;
        while (num!=0) 
        {
        r=num%10;
        if(r==0)
        c=1;
        num=num/10;
        }
        
        if(c==1)
        System.out.println("Its is a Duck Number");
        else
        System.out.println("Its not a Duck Number");
    }
    
}