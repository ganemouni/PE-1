import java.util.Scanner;
public class practice9{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = input.next();
        int n=s.length();
        char[] arr=new char[100];
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(n-i-1);

        }
        String str="";
        for(int j=0;j<n;j++){
            str=str+arr[j];
        }
        System.out.println(str);


        
    }
}