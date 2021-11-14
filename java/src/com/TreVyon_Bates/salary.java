package com.TreVyon_Bates;

public class salary
{
    static float grossYearlySalary
    static float taxes;
    public static float findSalary()
    {
        float netYearlySalary = grossYearlySalary - taxes;
        System.out.println(netYearlySalary);
        return netYearlySalary;
    }

    public static void main(String[] args)
    {
        findSalary();
    }
}
