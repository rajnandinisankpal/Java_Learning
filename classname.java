class calculator {
    int a = 5;
    int b = 5;

    void addition() {
        System.out.println("Addition is : " + (a + b));
    }

    void subtraction() {
        System.out.println("Subtraction is : " + (a - b));
    }

    void multiplication() {
        System.out.println("Multiplication is : " + (a * b));
    }

    void division() {
        System.out.println("Division is : " + (a / b));
    }
}

public class classname{
    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.addition();
        c1.subtraction();
        c1.multiplication();
        c1.division();
    }
}
