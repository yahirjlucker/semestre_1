/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_3;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = 0, k = 0;
        System.out.println("Numero de temperaturas de °C para las conversiones: ");
        int tam = sc.nextInt();
        double[] c = new double[tam];
        
        for(int i=0; i<c.length; i++){
            System.out.print("Temperatura en grados centigrados: ");
            c[i] = sc.nextInt();
        }
        for(int j=0; j<c.length; j++){
            f = (c[j] * 1.8) + 32;
            k = (c[j] + 273.15);
            System.out.println(c[j] + "° a grados farenheit: " + f + "°.");
            System.out.println(c[j] + "° a grados kelvin: " + k + "°.");
            System.out.println("");
        
        }
    }
}
