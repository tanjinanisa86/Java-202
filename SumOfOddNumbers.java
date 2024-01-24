/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.Scanner;
/**
 *
 * @author Lab5Pc-24
 */
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int sum=0;
        int i;
        for(i=1;i<=n;i++){
        int number2=inp.nextInt();
        if(number2%2!=0){
            sum=sum+number2;
        }
    }
      System.out.println(sum);  // TODO code application logic here
    }
    
}
