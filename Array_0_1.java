
import java.util.Scanner;

public class Array_0_1{
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Array :");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(a[i][j]%2==0){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print("1"+" ");
                }
            }
             System.out.println();
        }
        
    }
}