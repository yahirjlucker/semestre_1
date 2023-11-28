/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_18;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de la matriz cuadrada: ");
        int tam = sc.nextInt();
        int[][]  mat = new int[tam][tam];
   
        for(int i=0; i<tam; i++){
            for (int j = 0; j < tam; j++) {
                System.out.print("Valor para ("+i+")("+j+"): ");
                mat[i][j] =sc.nextInt();
            }
        }
        
        //1era Diagonal
         System.out.print("Valores de la primera diagonal: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(mat[i][i]+" ");
        }
        System.out.println("");
        System.out.print("Valores de la segunda diagonal: ");
        //2da diagonal
        for (int i = 1; i < tam; i++) {
            
            System.out.print(mat[i][i-1]+" ");
            
        }
    }
}
