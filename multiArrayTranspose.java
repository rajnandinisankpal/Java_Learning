import java.util.Scanner;

public class multiArrayTranspose{
    public static void main(String[] args) {
        int a[][][] = new int[2][3][3];
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter array elements");
            for(int k=0; k<2; k++){
                System.out.println("index "+k);
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        a[k][i][j] =sc.nextInt();
                    }

                }
            }

    for(int k=0; k<2; k++){
        System.out.println("Transpose :"+ k);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[k][j][i]+" ");
            }
            System.out.println();
        }

    }
        
    }
}