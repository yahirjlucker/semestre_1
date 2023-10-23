/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3_p6;
import java.util.Scanner;
/**
 *
 * @author jairg
 */
public class Unidad3_P6 {

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner (System.in);
        System.out.println("Hello Hospy, Determinar número par e impar");
        int n;
        
        System.out.println("Escribe un número entero");
        n =sc.nextInt();
if (n % 2 == 0) {
    System.out.println("El número es par");
} else {
    System.out.println("El número es impar");
}
        
        
        
    }
}
