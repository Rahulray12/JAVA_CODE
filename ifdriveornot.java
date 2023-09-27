import java.util.Scanner;
public class ifdriveornot {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enetr your age: ");
        int age = scanner.nextInt();
        if (age>=18) {
            System.out.println("You can drive !");
        }
        else{
            System.out.println("You cannot drive.");
        }

        
    } 
}
