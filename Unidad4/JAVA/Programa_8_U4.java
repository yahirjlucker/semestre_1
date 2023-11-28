/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_8;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int par=0, impar=0, n1=0, n2=0;
        System.out.print("Toatal de numeros a ingresar: ");
        int tam=sc.nextInt();
        int[] n= new int[tam];
        
         for(int i=0; i<n.length; i++){
            System.out.print("Ingrese un numero: ");
            n[i] = sc.nextInt();
         }
             //Sacar el tamaño de los arreglos 
        for(int j = 0; j<n.length; j++){
            if(n[j]%2==0){
                par++;
            }else{
                impar++;
            }
        }
            int[] par_array = new int[par];
            int[] impar_array = new int[impar];
            
            //Dar valores a los arreglos
        for(int j = 0; j<n.length; j++){
            if(n[j]%2==0){
                par_array[n1]=n[j];
                n1++;
            }else{
                impar_array[n2]=n[j];
                n2++;
            }    
        }
        
        //Pares
        System.out.print("Numeros pares: ");
        for(int k =0; k<par_array.length; k++){
            
            System.out.print(par_array[k]+" ");
        }
        //Impares
        System.out.println("");
        System.out.print("Numeros impares: ");
        for(int l=0; l<impar_array.length; l++){
            
            System.out.print(impar_array[l]+" ");
        }

            
        }
    }

