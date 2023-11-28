/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_17;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Numero de filas(X): ");
        int x= sc.nextInt();
        System.out.print("Numeros de columnas(Y): ");
        int y= sc.nextInt();
        int[][] uno = new int[x][y];
        int[][] dos = new int[x][y];
        int[][] tres = new int[x][y];
        
        //1
        System.out.println("Primera matriz");
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                System.out.print("Valor para ("+i+")("+j+"): ");
                uno[i][j]=sc.nextInt();
            }
        }
        //2
        System.out.println("Segunda matriz");
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                System.out.print("Valor para ("+i+")("+j+"): ");
                dos[i][j]=sc.nextInt();
            }
        }
        //3
        System.out.println("Multiplicacion de las dos matrices");
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                tres[i][j]= uno[i][j] * dos[i][j];
                System.out.print(tres[i][j]+"  ");
            }
        }
        
    }
}
