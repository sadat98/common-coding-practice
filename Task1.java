/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprogrammingpractice;

import java.util.Scanner;

/**
 *
 * @author Sayed Us Sadat
 */
public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        // using 'LONG' data type we can calculate upto 20!
        
        // using 'INT' data type we can calculate upto 12!
        
        // to know factorials greater than 20 use BigInteger class
        
        
        if (num > 20) {
            System.out.println("Calculation beyond scope of the program function.\nPlease try numbers within 20");

        } 
        else  if( num>0 && num <=12){
            int product = 1;
            for (int i = num; i >= 1; i--) {
                product = product * i;

            }
            System.out.println("Factorial of " + num + " is " + product);
        }
        else  if( num>12){
            long product = 1;
            for (long i = num; i >= 1; i--) {
                product = product * i;

            }
            System.out.println("Factorial of " + num + " is " + product);
        }
    }
}
