using System;
 namespace ProgramaU4_11;

 class Cal{
    static void Main(string[] args){
         int[,] m = {{100,99,67},{100,89,79},{100,100,90}};
        int suma=0, prom=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               suma=suma+m[i,j];
            }
        }
        prom=suma/9;
        Console.Write("Promedio de las calificaciones: "+prom);
    }
 }