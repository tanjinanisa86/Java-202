/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Lab5Pc-24
 */
public class Rectangle {
    public static void main(String[]args){
       Scanner inp=new Scanner(System.in);
       System.out.println("Enter the length");
       int length=inp.nextInt();
       System.out.println("Enter the width");
       int width=inp.nextInt();
       int area=(length*width);
       System.out.println("The area");
       System.out.println(area);
       int perimeter=2*(length+width);
       System.out.println("The perimeter");
       System.out.println(perimeter);
    }
}
