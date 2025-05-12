
import java.util.Scanner;

public class Even_0Array_multi{
    public static void main(String[] args) {
        int a[][][] = new int[2][3][3];

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Array :");

        for(int k=0; k<2; k++){
            System.out.println("index "+k);
           for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                a[k][i][j]=sc.nextInt();
                }
            }
        }

       
       for(int k=0; k<2; k++){
        System.out.println("even_0 "+k);
         for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(a[k][i][j]%2==0){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print(a[k][i][j]+" ");
                }
            }
             System.out.println();
             
        }
        System.out.println();

       }
       
        
    }
}