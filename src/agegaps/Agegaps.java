/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agegaps;

import java.util.Scanner;

/**
 *
 * @author 92019179
 */
public class Agegaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = in.nextInt();
        if (age >= 30){
        System.out.println("is over 30 years old");
        }
        else if (age >= 21){
        System.out.println("is between 21 and 29");
    }
        else if (age >= 11){
        System.out.println("is between 11 and 20");
    }
        else{
        System.out.println("you are between 0 and 10");
                }
    }    
    }
        
    
    

