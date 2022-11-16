/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java.methods_in_java;

import java.util.Scanner;

/**
 *
 * @author MINCHA
 */

public class Methods_in_java {

    public static void main(String[] args) {
        {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(num1, num2, num3)+"\n" );
    }

   public static double smallest(double num1, double num2, double num3)
    {
        return Math.min(Math.min(num1, num2), num3);
    }

    
}
    
    
    
 
