/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_19;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par=0; int impar=0;
        System.out.print("Numero de filas(X): ");
        int x= sc.nextInt();
        System.out.print("Numeros de columnas(Y): ");
        int y= sc.nextInt();
        int[][] num = new int[x][y];
        
         for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                System.out.print("Valor para ("+i+")("+j+"): ");
                num[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0; i<x; i++){
            for (int j = 0; j < y; j++) {
                if(num[i][j]%2==0){
                    par++;
                }else{
                    impar++;
                }
            }
        }
        
        System.out.println("Numeros pares: "+par);
        System.out.println("Numeros impares: "+impar);
    }
}
