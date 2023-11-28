/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_5;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de frutas: ");
        int tam=sc.nextInt();
        String[] fruta = new String[tam];
        String[] fruta_r = new String[tam];
        int l=tam-1;

        for(int i=0; i<fruta.length; i++){
            System.out.print("Ingrese el nombre de una fruta: ");
            fruta[i] = sc.nextLine();
        }

        for(int j=0; j<fruta.length; j++){
            fruta_r[j]= fruta[l];
            l--;
        }

        for(int k=0; k<fruta_r.length; k++){
            System.out.print(fruta_r[k]+", ");
        }
    }
}
