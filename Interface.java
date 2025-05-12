interface Payment {
    void pay();
    void cancel();
    void receipt();
}
class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment done using Credit Card.");
    }
    public void cancel() {
        System.out.println("Credit Card payment cancelled.");
    }
    public void receipt() {
        System.out.println("Credit Card payment receipt printed.");
    }
}
class UPI implements Payment {
    public void pay() {
        System.out.println("Payment done using UPI.");
    }
    public void cancel() {
        System.out.println("UPI payment cancelled.");
    }
    public void receipt() {
        System.out.println("UPI payment receipt printed.");
    }
}
public class Interface{
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        p1.pay();
        p1.receipt();
        
        Payment p2 = new UPI();
        p2.pay();
        p2.cancel();
    }
}
