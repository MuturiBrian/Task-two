/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package get.area_of_triangle;

import java.util.Scanner;



/**
 *
 * @author MINCHA
 */
public class Area_of_triangle {
 int Trianglebase,Triangleheight;
    static int Trianglearea;
    //
    public static void main(String[] args) {
        triangle Triangle1= new Triangle();//Calling a non static method through Triangle1
        Triangle1.getInput(); //Calling a non static method through Triangle1
        Triangle1.SetArea(); //Calling a non static method through Triangle1
        Triangle1.outputArea(); //Calling a non static method through Triangle1
}
    public void getInput()//define non ststic method
    {
        //start of body
        Scanner sc = new Scanner(System.in);
        //Enter the base of the Triangle
        System.out.println("Enter the base of the Triangle:");
        Trianglebase = sc.nextInt();
        //enterthe height of the Triangle
         System.out.println("Enter the height of the Triangle:");
        Triangleheight= sc.nextInt();
        //end of body
    }
        public int SetArea()//define non ststic method
        {
            //Formula of getting the area of the triangle
            Trianglearea =  Trianglebase*Triangleheight /2; //access non static variable
            return Trianglearea;//return a value of the non static variable
        }
        public static void outputArea()//define non static method
        {
            //The output of the area of the Triangle
       System.out.println("The area of a triangle is" +Trianglearea);
       //access non static variable
}
}

