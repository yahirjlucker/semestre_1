/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_20;
import java.util.Scanner;

/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de filas(X): ");
        int x= sc.nextInt();
        System.out.print("Numeros de columnas(Y): ");
        int y= sc.nextInt();
        int[][] num = new int[x][y];
        int[][] cua = new int[x][y];
        
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                System.out.print("Valor para ("+i+")("+j+"): ");
                num[i][j]=sc.nextInt();
            }
        }
        //Cuadrados
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                cua[i][j]= num[i][j] * num[i][j];
            }
        }
        //Imprimir al cuadrado
        System.out.print("Numeros al cuadrado: ");
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                System.out.print(cua[i][j]+" ");
            }
        }
       

    }
}
