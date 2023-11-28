/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_4;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nega=0;
        System.out.print("Cantidad de numero a evalurar: ");
        int tam = sc.nextInt();
        int[] n = new int[tam];

        for(int i=0; i<n.length; i++){
            System.out.print("Ingrese el numero: ");
            n[i]=sc.nextInt();
        }

        for(int i=0; i<n.length; i++){
            if(n[i]<0){
                nega++;
            }
        }
        System.out.print("Total de numeros negativos que hay: "+nega);
    }
}
