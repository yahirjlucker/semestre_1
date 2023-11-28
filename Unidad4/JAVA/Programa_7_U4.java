/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_7;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1, p2;
         double media=0, mediana=0, suma=0;
         System.out.print("Cantidad de numeros a calcular: ");
         int tam = sc.nextInt();
         int[] n = new int[tam];
         
         //Ingresar valores al arreglo
        for(int i=0; i<n.length; i++){
            System.out.print("Ingrese un numero: ");
            n[i]= sc.nextInt();
        }
        
        // Sacaar la media
        for(int i=0 ; i<n.length; i++){
            suma = suma+n[i];
        }
        media = suma/n.length;
        System.out.println("Media: "+media);
           
         //Sacar la mediana
        
        if(n.length%2==0){
            p1=(n.length/2)-1;
            p2=n.length/2;
            mediana=(n[p1]+n[p2])/2;
            System.out.println("Mediana: "+mediana);
        }else{
            mediana=(n.length-1)/2;
            System.out.println("Mediana: "+n[(int)mediana]);
        }
         
    }
}
5