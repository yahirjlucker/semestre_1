/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p2_unidad_3;
import java.util.Scanner;

public class P2_Unidad_3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int c1, c2, c3, c4, c5, c6, p, s;
        System.out.println("Promedio calificaciones");
       
        System.out.println("Introduce el valor de la calificación 1");
        c1 = sc.nextInt();
        System.out.println("Introduce el valor de la calificación 2");
        c2 = sc.nextInt();
        System.out.println("Introduce el valor de la calificación 3");
        c3 = sc.nextInt();
        System.out.println("Introduce el valor de la calificación 4");
        c4 = sc.nextInt();
        System.out.println("Introduce el valor de la calificación 5");
        c5 = sc.nextInt();
        System.out.println("Introduce el valor de la calificación 6");
        c6 = sc.nextInt();
        
        s = c1+c2+c3+c4+c5+c6;
        p = s / 6;
        if(p >=70){
             System.out.println("Usted está aprobado su calificación es "+ p);
        }else{
             System.out.println("Usted está reprobado su calificación es" + p);
        }
        
        
        
        
        
        
        
        
        
        
    }
}
