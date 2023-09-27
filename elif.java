import java.util.Scanner;
public class elif {
    public static void main(String[] args) {
        System.out.println("Working on the ELSE IF: ");

        Scanner sc=new Scanner(System.in);

        System.out.println("Taking the three integers from user to check which one is greatest.");
        System.out.printf("Enter the first integer:");
        int a=sc.nextInt();
        System.out.printf("Enter the second integer:");
        int b=sc.nextInt();
        System.out.printf("Enetr the third integer:");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("The greatest number is" +a);

        }
        else if(b>a && b>c){
            System.out.println("The greatest number is"+b);
        }
        else{
            System.out.println("The greatest number is" +c);
        }

    }
}
