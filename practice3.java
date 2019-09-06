import java.util.Scanner;
public class practice3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word");
        String s = input.next();
        int x=s.length();
        String str="";

        for(int i=0;i<x;i++){
            String v =check(s.charAt(i));
            str=str+v+" ";
            
        }

        System.out.println(str);



    }
    public static String check(char s){
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
            return "Vowel";

        }
        else if(s>'a'&&s<='z'){
            return "Consonant";

        }
        else{
            return "invalid character";
        }
           
    }
}