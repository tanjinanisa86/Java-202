/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author Lab5Pc-24
 */
public class Triangle {
public static void main(String[]args){
       Scanner inp=new Scanner(System.in);
       System.out.println("Enter the length");
       int length=inp.nextInt();
       System.out.println("Enter the base");
       int base=inp.nextInt();
       System.out.println("Enter the height");
       int heigth=inp.nextInt();
       double area=(0.5*base*heigth);
       System.out.println("The area");
       System.out.println(area);
       int perimeter=length+base+heigth;
       System.out.println("The perimeter");
       System.out.println(perimeter);
    }
}
