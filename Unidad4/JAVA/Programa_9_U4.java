/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programau4_9;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class ProgramaU4_9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] nombre = new String[1];
        String[] apellidos = new String[1];
        String[] c = new String[2];
        
        System.out.print("Escibra su nombre(s): ");
        nombre[0] = sc.nextLine();
        System.out.print("Escriba sus apelldios: ");
        apellidos[0] = sc.nextLine();

        c[0]=nombre[0];
        c[1]=apellidos[0];

        System.out.print("Nombre completo: "+c[0]+" "+c[1]);
    }
}
