/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_16;

/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_16 {

    public static void main(String[] args) {
        String[][] p = {{"Hector","Darien","Gael"},{"Manuel","Ricardo","Jose"}};
        System.out.print("Matriz:: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(p[i][j]+" ");
            }
        }
        System.out.println("");
        System.out.print("Matiz al reves: ");
        for(int i=1; i>=0; i--){
            for(int j=2; j>=0; j--){
                System.out.print(p[i][j]+" ");
            }
        
        }
        }
        
    }

