package com.democalculator;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator
{
   private static DecimalFormat df = new DecimalFormat("0.000");
   public static void main(String args[])
   {
    float a,b,calc;
    char commend;
    Scanner number = new Scanner(System.in);
    do
    {
        System.out.println("-------------------------");
        System.out.println("Chavi Calculator by Tajhoba Williams");
        System.out.println("-------------------------");
        System.out.println("Commend : \n1.Add\n2.Subtract\n3.Divide\n4.Multiply\n5.Clear\n6.Quit");
        System.out.print("Enter your command : ");
        commend=number.next().charAt(0);

        switch(commend)
        {
            case '1':System.out.println("Enter two numbers : ");
            a=number.nextFloat();
            b=number.nextFloat();
            calc=a+b;
            System.out.println("Result : " +df.format(calc));
            break;

            case '2':System.out.println("Enter two numbers : ");
            a=number.nextFloat();
            b=number.nextFloat();
            calc=a-b;
            System.out.println("Result : " +df.format(calc));
            break;

            case '3':System.out.println("Enter two numbers : ");
            a=number.nextFloat();
            b=number.nextFloat();
            calc=a/b;
            System.out.println("Result : " +df.format(calc));
            break;

            case '4':System.out.println("Enter two numbers : ");
            a=number.nextFloat();
            b=number.nextFloat();
            calc=a*b;
            System.out.println("Result : " +df.format(calc));
            break;

            case '5':
               System.out.println("Clear\n");
               break;