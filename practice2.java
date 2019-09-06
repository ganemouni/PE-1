import java.util.Scanner;
public class practice2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int x=input.nextInt();
        if(x>20&&x<30){
            if(x%2==0){
                System.out.println("Jerry");
            }
            else{
                System.out.println("Tom");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}