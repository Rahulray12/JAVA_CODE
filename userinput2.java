import java.util.Scanner;
public class userinput2 {
    public static void main(String[] args) {
        System.out.println("Again taking input from user:");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entyer the first number:");
        int a= scanner.nextInt();

        System.out.println("Enter the second number:");
        int b= scanner.nextInt();

        int diifference=a-b;
        System.out.println(diifference);
    }
}
