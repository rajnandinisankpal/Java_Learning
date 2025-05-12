import java.util.*;
public class SumArrayOdd{
    public static void main(String[] args) {
       
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
         int sum =0;
        for(int i=0; i<5; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<5; i++){
            if(a[i]%2!=0){

                sum = sum+a[i];
            }
        }
        System.out.println(sum);
    }
}