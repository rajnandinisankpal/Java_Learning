class Constructor{
    int id;
    String name;
    String email;
    String pass;

    Constructor(int x, String a, String b, String c){
        id=x;
        name=a;
        email=b;
        pass=c;
    }

    Constructor(Constructor ck){
        id = ck.id;
        name=ck.name;
        email=ck.email;
        pass=ck.pass;

    }
    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + pass);
    }


}

public class CopyCon{
    public static void main(String[] args) {
      Constructor c1 = new Constructor(1, "Raj", "raj@gmail.com", "raj123");
      c1.display();

     Constructor c2 = new Constructor(c1);
      c2.display();
    }
}