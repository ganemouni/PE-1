import java.util.Scanner;
public class practice8{
    public static void main(String[] args){
        int target = 23;
       
     boolean f=true;
           
             
       while(f){
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number?");
        int y=input.nextInt();
        if(y>target){
            System.out.println("Number guessed is more than original number");
    
        }
        else if(y<target){
            System.out.println("Number guessed is less than original number");
            
        }
        else if(y==target){
            System.out.println("Number guessed matches the original number");
            // System.exit(0);
            f=false;
            
        }

       }
       

}

}