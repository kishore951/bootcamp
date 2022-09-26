package calculator;

import java.util.Scanner;

public class CalMath {
    public static void main(String[] args) {
        int choice,x,y,r;
        while(true){

            System.out.println("Select the option");
            System.out.println("1. Addition");
            System.out.println("2. Subtractor");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();
             switch (choice)
             {
                 case 1:
                     System.out.println("Addition of x and y");
                     r=x+y;
                     System.out.println("Answer is"+r);
                     break;
                 case 2:
                     System.out.println("Subtraction of x and y");
                     r=x-y;
                     System.out.println("Answer is"+r);
                     break;
                 case 3:
                     System.out.println("Multiplication of x and y");
                     r=x*y;
                     System.out.println("Answer is"+r);
                     break;
                 case 4:
                     System.out.println("division of x and y");
                     r=x/y;
                     System.out.println("Answer is"+r);
                     break;
                 case 5:
                     System.exit(0);
             }

        }
    }
}
