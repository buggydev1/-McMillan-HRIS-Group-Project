package com.TreVyon_Bates;

public class salary
{
    static float wage;
    static float hoursWorked;
    static float taxes;
    public static float findSalary()
    {
        float grossYearlySalary = wage * hoursWorked;
        float netYearlySalary = grossYearlySalary - taxes;
        System.out.println(netYearlySalary);
        return netYearlySalary;
    }

    public static void main(String[] args)
    {
        findSalary();
    }
}
