import java.util.Scanner;

public class arrayCopy{
    public static void main(String[] args) {
        int a[][][] = new int[2][3][3];
        Scanner sc = new Scanner(System.in);
        int i,j,k;
       
        System.out.println("Enter array elements");
          
                for(i=0; i<3; i++){
                    for(j=0; j<3; j++){
                        a[0][i][j] =sc.nextInt();
                    }
                }

                for(i=0; i<3; i++){
                    for(j=0; j<3; j++){
                        a[1][i][j] = a[0][i][j];
                    }
                }
           
        System.out.println("array 2 ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(a[1][i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}