import java.util.Scanner;

public class practice4{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        for(int i=1;i<=num;i++){
            int j=0;
            while(j!=i){
                System.out.print(i+" ");
                j++;
            }
           

        }
        System.out.println(" ");

    }

}