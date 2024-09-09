/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicletype;

import java.util.Scanner;


/**
 *
 * @author Rouche Oelofse
 */
public class VehicleType {

    public static void main(String[] args) 
    {
        String[] [] vehicleTypes = {};
        
        Scanner scan  = new Scanner(System.in);
        
        int jan1Input;
        int jan2Input;
        int jan3Input;
        int janTotal;
        int feb1Input;
        int feb2Input;
        int feb3Input;
        int febTotal;        
        int mar1Input;
        int mar2Input;
        int mar3Input;
        int marTotal;
        
        
        System.out.println("Hello, please enter sales for the month (JAN): ");
        jan1Input =   scan.nextInt();
        System.out.println("Hello, please enter sales for the month (JAN): ");
        jan2Input =   scan.nextInt();
        System.out.println("Hello, please enter sales for the month (JAN): ");
        jan3Input =   scan.nextInt();
        
        System.out.println("Hello, please enter sales for the month (FEB): ");
        feb1Input =   scan.nextInt();
        System.out.println("Hello, please enter sales for the month (FEB): ");
        feb2Input =   scan.nextInt();
        System.out.println("Hello, please enter sales for the month (FEB): ");
        feb3Input =   scan.nextInt();
        
        System.out.println("Hello, please enter sales for the month (MAR): ");
        mar1Input =   scan.nextInt();
        System.out.println("Hello, please enter sales for the month (MAR): ");
        mar2Input =   scan.nextInt();
        System.out.println("Hello, please enter sales for the month (MAR): ");
        mar3Input =   scan.nextInt();
        
        
        janTotal = jan1Input  + jan2Input +  jan3Input;
        febTotal = feb1Input  + feb2Input +  feb3Input;
        marTotal = mar1Input  + mar2Input +  mar3Input;
        
        if(janTotal  >= 100){
            System.out.println("Gold Status");
        } else {
            System.out.println("Silver Status");
        }
        if(febTotal  >= 100){
            System.out.println("Gold Status");
        } else {
            System.out.println("Silver Status");
        }
        if(marTotal  >= 100){
            System.out.println("Gold Status");
        } else {
            System.out.println("Silver Status");
        }
        
        
        System.out.println("***************************************************************");
        System.out.println("VEHICLE SALES  REPROT");
        System.out.println("***************************************************************");
        
        System.out.println("\t\tJAN\t\tFEB\t\tMAR");
        System.out.println("\t\t"  + jan1Input + "\t\t" + jan2Input + "\t\t" + jan3Input);
        System.out.println("\t\t"  + feb1Input + "\t\t" + feb2Input + "\t\t" + feb3Input);
        System.out.println("\t\t"  + mar1Input + "\t\t" + mar2Input + "\t\t" +- mar3Input);
        
        
    }
}
