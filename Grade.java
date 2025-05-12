public class Grade{
    public static void main(String[] args) {
        int marks = 85;

        if(marks>=95){
            System.out.println("A+ Grade");
        }
        else if(marks<95 && marks>=85){
            System.out.println("A Grade");
        }
        else if(marks<85 && marks>=70){
            System.out.println("B Grade");
        }
        else if(marks<70 && marks>=55){
            System.out.println("C Grade");
        }
        else if(marks<55 && marks>=35){
            System.out.println("D Grade");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}