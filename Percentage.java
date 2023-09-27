import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        System.out.println("Here,calculating the total percentage of a student.");
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the total marks of a subject:");
        //int Tot_marks=sc.nextInt();
        

        int totalMarks=500;
        System.out.println("enter the mark of english:");
        int eng=sc.nextInt();

        System.out.println("Enter the marks of nepali:");
        int nep=sc.nextInt();

        System.out.println("Enter the marks of maths:");
        int maths=sc.nextInt();

        System.out.println("Enter the marks of physics:");
        int physics=sc.nextInt();

        System.out.println("Enetr the marks of social:");
        int social=sc.nextInt();

        int Total_marks_obtd=(eng+nep+maths+physics+social);
        System.out.println(Total_marks_obtd);

        float Percent=((float)Total_marks_obtd/totalMarks)*100;

        System.out.println("The percentage obtained by a students is"+Percent);


    }
}
