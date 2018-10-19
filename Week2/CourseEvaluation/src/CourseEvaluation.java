package lu.uni.scanner;
import java.util.Scanner;


public class CourseEvaluation
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input midterm1:");
        double midterm1 = scanner.nextDouble();
        midterm1 = Math.min(midterm1,20);
        midterm1 = Math.max(midterm1,0);
       /* if(midterm1>20)
        {
            midterm1 = 20;
        }
        if(midterm1 <0)
        {
            midterm1 = 0;
        }*/
        System.out.print("Input midterm2:");
        double midterm2 = scanner.nextDouble();
        midterm2 = Math.min(midterm2,20);
        midterm2 = Math.max(midterm2,0);
        /*if(midterm2>20)
        {
            midterm2 = 20;
        }
        if(midterm2 <0)
        {
            midterm2 = 0;
        }*/
        System.out.print("Input finalexam:");
        double finalexam = scanner.nextDouble();
        finalexam = Math.min(finalexam,20);
        finalexam = Math.max(finalexam,0);
        /*if(finalexam>20)
        {
            finalexam = 20;
        }
        if(finalexam <0)
        {
            finalexam = 0;
        }*/
        double average = 0.0;
        average = midterm1*0.2+midterm2*0.2+finalexam*0.6;
        System.out.println("Midterm1 is "+midterm1);
        System.out.println("Midterm2 is "+midterm2);
        System.out.println("Finalexam is "+finalexam);
        System.out.println("Average is "+average);

    }
}
