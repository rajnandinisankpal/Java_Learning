import java.util.Scanner;

public class AscendingArray{
    public static void main(String[] args) {
       
        int a[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements");
        for(int i=0; i<5; i++){
            a[i]=sc.nextInt();
        }

       int min=a[0];
       for(int i=0; i<a.length; i++){
        if(a[i]<min){
            min=a[i];
        }
         System.out.println(min-a[i]-4);
       }
      
    }
}