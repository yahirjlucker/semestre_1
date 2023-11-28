using System;
namespace ProgramaU4_14;

class Suma{
    static void Main(string[] args){
        int[,] datos = {{2,3,1,4},{5,1,3,3},{10,2,9,2}};
        int suma=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                suma = suma + datos[i,j];
            }
        }
        Console.Write("La suma de los datos es de: "+suma);
    }
}
