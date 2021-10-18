package zacharyberghoff;
import java.util.*;
//As an employer, I need to be able to update an employee's pay when they are promoted

public class promotionSalary
{
    static boolean promotion;
    static int empId;
    static int salary;
    static String notPromoted = "This employee was not promoted.";

    public static int payPromotion()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an employee ID number.");
        empId = scan.nextInt();
        System.out.println("Has this employee been promoted?");
        promotion = scan.nextBoolean();
        if (promotion = true)
        {
            System.out.println("Please enter the new salary for employee #" + empId);
            salary = scan.nextInt();
            return salary;
        }
        else
            return salary;
    }

    public static void main(String[] args)
    {
        payPromotion();
        System.out.println("The updated salary for employee #" + empId + " is " + salary);
    }
}
