/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3_p8;
import java.util.Scanner;
/**
 *
 * @author jairg
 */
public class Unidad3_P8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Hello Hospy again!, Determinamos que número es mayor");
        int n1, n2;
        System.out.println("Escribe un número");
        n1 = sc.nextInt();
        System.out.println("Escribe otro número :v ...");
        n2 = sc.nextInt(); 
      
      if(n1>n2) {
System.out.println("El número mayor es:" +n1); 

      }else     System.out.println("El número mayor es:" +n2); 
 

    
        
    }
    
}
