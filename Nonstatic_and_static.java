/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package get.nonstatic_and_static;

import java.util.Scanner;

/**
 *
 * @author MINCHA
 */
public class Nonstatic_and_static {
    int Rectanglewidth,Rectanglelength;//declaring non static variables
      static int Rectanglearea;//declaring static variables
    //Main Method
    public static void main(String[] args) {
        Rectangle Rectangle1= new Rectangle();
        Rectangle1.getInput();
        Rectangle1.SetArea();
        Rectangle1.outputArea();

    /**
     *
     */}
      public int getInput() //define non static method
    {
        //start body
        Scanner sc = new Scanner(System.in);
        //get the width of the rectangle
        System.out.println("Enter the width of the Triangle:");
        Rectanglewidth = sc.nextInt();
        //get the length of the rectangle
         System.out.println("Enter the length of the Triangle:");
        Rectanglelength= sc.nextInt();
        //end body
    }
        public  int SetArea()//define non static method
        {
            Rectanglearea = Rectanglewidth*Rectanglelength;//Access non static variable
            return Rectanglearea;
        }
        public static void outputArea()//define non static method
        {
       System.out.println("The area of a rectangle is" +Rectanglearea);
}
//Access non static variable
}