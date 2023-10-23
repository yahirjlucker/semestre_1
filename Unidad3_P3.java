/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3_p3;
import java.util.Scanner;

/**
 *
 * @author jairg
 */
public class Unidad3_P3 {

    public static void main(String[] args) {
        Scanner sc = new
        Scanner(System.in);       
        int dia;
        System.out.println("Escribe el día de la semana númerico");
        dia = sc.nextInt();
        switch (dia){
            case 1:
                System.out.println("Es Lunes");
                break; 
            case 2:
                System.out.println("Es Martes");
                break;
            case 3:     
                System.out.println("Es Miercoles");
                break;
            case 4:
                System.out.println("Es Jueves");
                break;
            case 5:
                System.out.println("Es Viernes");
                break;
            case 6:
                System.out.println("Es Sábado");
                break;
            case 7:
                System.out.println("Es Domingo");
                break;
            default:
        } 
                
    
    
    
    }
}
// Te pareces a Hospy