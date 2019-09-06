import java.util.Scanner;
public class practice7{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num=input.nextInt();
        int x=num,k=0;
        int[] a=new int[100];
        while(x!=0){
            a[k]=x%10;
            x=x/10;
            k++;
        }
        int length=k;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        int sum=0,req=0;
        for(int b=length-1;b>=0;b--){
            if(a[b]%2==0){
                sum=sum+a[b];
            }
            req=req*10+a[b];
        }
        if(sum>15){
            System.out.println("Sorted number in non-increasing order :"+req +" "+"true");
        }
        else{
            System.out.println("Sorted number in non-increasing order :"+req + " "+"false");

        }

    }
}