import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int temp = num;
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        System.out.println("Original number: " + temp);
        System.out.println("Number of digits: " + count);
        
    }
}
