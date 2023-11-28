/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_15;

/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_15 {

    public static void main(String[] args) {
        int[][] c = {{10,56,12},{43,41,9},{2,4,8}};
        int suma=0;
        double media;
        for(int i=0; i<3; i++){
            System.out.print("Media de la fila "+i+": ");
            for(int j=0; j<3; j++){
                suma = suma + c[i][j];
            }
            media=suma/3;
            suma=0;
            System.out.println(media);
        
        }
        
       
        
    }
}
