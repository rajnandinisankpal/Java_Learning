import java.util.Scanner;

public class Largest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        
        if (a > b && a > c) {
            System.out.println(a + " is largest");
        } else if (b > c && b > a) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}
