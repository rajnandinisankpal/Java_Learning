
import java.util.*;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        int temp =n;
        int ans =0;

        while(n>=1){
            int digit = n%10;
            ans = ans + (digit* digit*digit);
            n /=10;
        }
        if(ans==temp){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not");
        }
    }
}