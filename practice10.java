import java.util.Scanner;
public class practice10{
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the string");
        String s=input1.next();
        System.out.println("Enter the number");
        int n=input2.nextInt();
        int length=s.length();
        int x=n;
        String str="";
        while(x!=0){
            for(int i=length-n;i<length;i++){
                str=str+s.charAt(i);
            }
            x--;
        }
        System.out.println(s+str);

        
    }
}