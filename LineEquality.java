import java.util.Scanner;
public class LineEquality {
    public static void main(String[] args) {
       
      
        Scanner sc = new Scanner(System.in);
double x1,x2,y1,y2;
        double LengthofLine1;
        System.out.println("Enter the value of x1 :");
        x1 = sc.nextInt();
        System.out.println("Enter the value of y1 :");
        y1 = sc.nextInt();
        System.out.println("Enter the value of x2 :");
        x2 = sc.nextInt();
        System.out.println("Enter the value of y2 :");
        y2 = sc.nextInt();
        LengthofLine1 = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("The length of a line =" +LengthofLine1);

         double x3,x4,y3,y4;
        double LengthofLine2;
        System.out.println("Enter the value of x3 :");
        x3 = sc.nextInt();
        System.out.println("Enter the value of y3 :");
        y3 = sc.nextInt();
        System.out.println("Enter the value of x4 :");
        x4 = sc.nextInt();
        System.out.println("Enter the value of y4 :");
        y4 = sc.nextInt();
 LengthofLine2 = Math.sqrt(Math.pow(x4-x3,2)+ Math.pow(y4-y3,2));
        System.out.println("The length of a line =" +LengthofLine2);
        String LineA=String.valueOf(LengthofLine1);
        String LineB=String.valueOf(LengthofLine2);

        if(LineA.equals(LineB)){
            System.out.println("Length of both lines are equal");
        }else{
            System.out.println("lengths are not equal");
        }
}}