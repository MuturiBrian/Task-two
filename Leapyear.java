/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//Task two question three
package leapyear.leapyear;

/**
 *
 * @author MINCHA
 */
import java.util.Scanner;
public class Leapyear {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       //Asking user to enter the year
        System.out.print("Input the year: ");
        int year = in.nextInt();
        //Determine if it is a leap year or not
        boolean num1 = (year % 4) == 0;
        boolean num2 = (year % 100) != 0;
        boolean num3 = ((year % 100 == 0) && (year % 400 == 0));

        if (num1 && (num2 || num3))
        {
            //print if it is a leap your
            System.out.println(year + " is a leap year");
        }
        else
        {
            //print if it not a leap year
            System.out.println(year + " is not a leap year");
        }
    }
}

        