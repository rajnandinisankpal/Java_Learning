import java.util.Scanner;

public class LargestArray{
    public static void main(String[] args) {
       
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        for(int i=0; i<5; i++){
            a[i]=sc.nextInt();
        }

       int max=a[0];
       for(int i=0; i<a.length; i++){
        if(a[i]>max){
            max=a[i];
        }
       }
       System.out.println(max);
    }
}