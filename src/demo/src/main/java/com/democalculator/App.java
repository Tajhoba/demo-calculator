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
