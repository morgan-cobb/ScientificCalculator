import java.util.Scanner;
import java.text.DecimalFormat;
public class SciCalculator
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("##.##");
        //declared variables here so it would be less confusing to read as you go along
        double ans = 0.0;
        boolean calculate = true;
        int nCalc =  0; /*This stands for the number of calculations done already*/
        double sum = 0;
        double avg;
        boolean play;

        //while this is true the calculator will continue to work. Case 0 of the switch turns calculate to false to end the program
        while(calculate)
        {
            sum += ans;
            System.out.println("Current Result:"+ ans + "\n");
            System.out.println("Calculator Menu\n --------------- \n 0.Exit Program \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
            System.out.println(" 5.Exponentiation \n 6.Logarithm \n 7.Display Average");

            //Had to have a second while loop so it didn't continue to print the menu
            play = true;
            while(play)
            {
                System.out.println("Enter Menu Selection: ");
                int selection = scan.nextInt();

                //Here I used a switch for the user to decide which function of the calculator they wanted to use.
                switch(selection)
                {
                    case 0: //Exit Program
                        System.out.println("Thanks for using this calculator. Goodbye!");
                        play = false;
                        calculate = false;
                        nCalc++;
                        break;
                    case 1: //Addition
                        System.out.println("Enter first operand: ");
                        double firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        double secondOp = scan.nextDouble();
                        ans = firstOp + secondOp;
                        nCalc++;
                        play = false;
                        break;
                    case 2: //Subtraction
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        ans = firstOp - secondOp;
                        nCalc++;
                        play = false;
                        break;
                    case 3: //Multiplication
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        ans = firstOp * secondOp;
                        nCalc++;
                        play = false;
                        break;
                    case 4: //Division
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        ans = firstOp / secondOp;
                        nCalc++;
                        play = false;
                        break;
                    case 5: //Exponentiation
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        ans = Math.pow(firstOp, secondOp);
                        nCalc++;
                        play = false;
                        break;
                    case 6: //Logarithm
                        System.out.println("Enter first operand: ");
                        firstOp = scan.nextDouble();
                        System.out.println("Enter second operand: ");
                        secondOp = scan.nextDouble();
                        ans = (Math.log(secondOp)) / Math.log(firstOp);
                        nCalc++;
                        play = false;
                        break;
                    case 7: //Display Average
                        if (nCalc < 1)
                        {
                            System.out.println("Error: No calculations yet to average!");
                        } else {
                            avg = sum/nCalc;
                            System.out.println("Sum of calculations:" + sum + "\nNumber of calculations:" + nCalc + "\nAverage of calculations:" + df2.format(avg));
                        }
                        break;
                    default: //Print the error if the correct operation is not chosen
                        System.out.println("Error: Invalid selection!");
                }
            }
        }
    }
}

