/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad3_p7;
import java.util.Scanner;
/**
 *
 * @author jairg
 */
public class Unidad3_P7 {

    public static void main(String[] args) {
     Scanner sc = new Scanner ( System.in);
        System.out.println("Hello Hospy, Determinar Clima");
        int tem;
        System.out.println("Escribe la temperatura del clima en número entero");
        tem =sc.nextInt();
if (tem>27) {
    System.out.println("Hace calor!");
} if (tem>20)if(tem<27) {
    System.out.println("Clima Agradable");
}
if (tem<20){      
   System.out.println("Clima Fresco, hace frío");
}
   
    }
}
