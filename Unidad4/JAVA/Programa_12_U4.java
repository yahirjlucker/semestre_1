/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_12;

/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_12 {

    public static void main(String[] args) {
        int [][] matriz = {{10,2,3,1},{12,21,32,12},{8,89,29,1}};
        int fila=3, col=4;
        for(int i=0; i<fila; i++){
            for(int j=0; j<col; j++){
                if(j==3){
                    System.out.println("[ "+matriz[i][j]+" ] ");
                }else{
                    System.out.print("[ "+matriz[i][j]+" ] ");
                
                }
                   
            }
        }
    }
}
