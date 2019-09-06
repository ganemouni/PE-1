import java.util.Scanner;
public class practice5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s;
        System.out.println("Enter the number");
        s=input.nextLine();
        result(s);
    }
    public static void result(String x){
    int i=0;int sum=0;String k="";int n=0;
   for (i=0;i<x.length();i++)
   {
       char d =x.charAt(i);
       if(d!=' ')
       {
           k=k+d;
        n= Integer.parseInt(k);
       }
        else
        {k="";
        sum=sum+n;
       }  
    }
   sum=sum+n;
   System.out.println(sum);
   }
}



        

        