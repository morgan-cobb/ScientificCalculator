import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        double firstOp = scan.nextDouble();
        System.out.println("Enter second operand: ");
        double secondOp = scan.nextDouble();
        System.out.println("Calculator Menu\n --------------- \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        System.out.println("Which operation do you want to perform?");
        int operation = scan.nextInt();
        double ans;
        //Used a switch instead of an if statement because it was simpler
        switch(operation)
        {
            case 1: //Addition
                ans = firstOp + secondOp;
                System.out.println("The result of the operation is " + ans + ". Goodbye!");
                break;
            case 2: //Subtraction
                ans = firstOp - secondOp;
                System.out.println("The result of the operation is " + ans + ". Goodbye!");
                break;
            case 3: //Multiplication
                ans = firstOp*secondOp;
                System.out.println("The result of the operation is " + ans + ". Goodbye!");
                break;
            case 4: //Division
                ans= firstOp/secondOp;
                System.out.println("The result of the operation is " + ans + ". Goodbye!");
                break;
            default: //Print the error if the correct operation is not chosen
                System.out.println("Error: Invalid selection! Terminating program.");
        }

}

}
