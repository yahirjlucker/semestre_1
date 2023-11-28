/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_6;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_6 {

    public static void main(String[] args) {
        double temporal;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de numeros a ingresar: ");
        int tam = sc.nextInt();
        double[] n = new double[tam];
        
        for(int i=0; i<n.length;i++){
            System.out.print("Ingrese un numero: ");
            n[i]=sc.nextDouble();
        }
        
         // Metodo burbuja: Revisa todo los valores del arreglo hasta que no necesiten más cambios
        for(int j=0; j<n.length; j++){ 
            for(int k=0; k<n.length;k++){
                if(n[j]>n[k]){
                    temporal=n[j]; //Un auxiliar para que no se pierda el valor que es mayor
                    n[j]=n[k]; // Se pasa para atras el menor
                    n[k]=temporal;// Ahora el valor que estaba comparando se pasa para delante del arreglo
                }
            }
        }
        System.out.println("Numeros ordenaods descendentemente: ");
        for(int h=0; h<n.length; h++){
            System.out.println(n[h]);
        }
    }
}
