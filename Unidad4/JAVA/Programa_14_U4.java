/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_14;

/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_14 {

    public static void main(String[] args) {
        int[][] datos = {{2,3,1,4},{5,1,3,3},{10,2,9,2}};
        int suma=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                suma = suma + datos[i][j];
            }
        }
        System.out.println("La suma de los datos es de: "+suma);
    }
}
