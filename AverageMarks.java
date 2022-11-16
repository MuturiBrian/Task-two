/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//Task two question 3
package check.average.marks;

/**
 *
 * @author MINCHA
 */
import java.util.Scanner;
public class AverageMarks {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //Ask user to enter marks for the first unit
       System.out.print("Marks for Java Programming is: ");
       int java1 = input.nextInt();
       //Ask user to enter marks for the second unit
       System.out.print("Marks for Networking is: ");
       int net2 = input.nextInt();
       //Ask user to enter marks for the third unit
       System.out.print("Marks for Math is: ");
       int math3 = input.nextInt();
       //Getting average of the total units
       System.out.println("Average of three units is: " + 
   (java1+ net2+math3) / 3.00);
    }
}
