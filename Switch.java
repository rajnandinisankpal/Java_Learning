import java.util.*;

public class Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A :");
        int A = sc.nextInt();

        System.out.println("Enter B :");
        int B = sc.nextInt();
        
        char choice;
        System.out.println("Enter choice to perform operation");
        choice=sc.next().charAt(0);

        switch (choice) {
            case '+' :
            System.out.println("Addition = "+(A+B));
            break;

            case '-' :
            System.out.println("Subtraction = "+(A-B));
            break;

            case '*' :
            System.out.println("Multiplication = "+(A*B));
            break;

            case '/' :
            System.out.println("Division = "+(A/B));
            break;

            case '%' :
            System.out.println("Modulo = "+(A%B));
            break;

            default:
                System.out.println("wrong input");
        }


    }
}