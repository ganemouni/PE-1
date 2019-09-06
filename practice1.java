import java.util.Scanner;
public class practice1{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        long x =input.nextLong();
       String s= palindrome(x);
       System.out.print(x);
       System.out.println(" "+s);


    }
    public static String palindrome(Long num){
        long a=0 ;
        long x=num;
        while(x!=0){
            a=(a*10)+(x%10);
            x=x/10;
        }
        if(a==num){
            long b=a,c,d=0;
            while(b!=0){
                c=b%10;
                if(c%2==0){
                    d=d+c;
                }
                b=b/10;
            }
            if(d>=25){
                return " is palindrome and the sum of even numbers is greater than 25";
            }
            else{
                return "is palindrome and the sum of even numbers is less than 25";
            }
            
        }
        else{
            return "is not palindrome";
        }

    } 
}