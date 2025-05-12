
import java.util.Scanner;

public class SumArray{
    public static void main(String[] args) {

        
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        int sum =0;
        for(int i=0; i<5; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<5; i++){
            
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}