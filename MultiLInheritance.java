
class Entry{
    void mask(){
        System.out.println("Please use mask inside the Hospital");
    }
}

class Reception extends Entry{
    void casepaper(){
         System.out.println("Make Case Paper and do Payment First");
    }
}

class Checkup extends Reception{
    void Checkup(){
        System.out.println("Checkups are Done ");
    }
}

class Medical extends Checkup{
    void medicines(){
        System.out.println("You can take this medicines");
    }
}

class Exit extends Medical{
    void exit(){
        System.out.println("You may go, Contact us whenever you need ");
    }
}


public class MultiLInheritance{
    public static void main(String[] args) {
       Exit e1 = new Exit();
       e1.mask();
       e1.casepaper();
       e1.Checkup();
       e1.medicines();
       e1.exit();
        
    }
}