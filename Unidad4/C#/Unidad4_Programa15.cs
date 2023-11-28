using System;
namespace ProgramaU4_15;

class Media{
    static void Main(string[] args){
        int[,] c = {{10,56,12},{43,41,9},{2,4,8}};
        int suma=0;
        double media;
        for(int i=0; i<3; i++){
            Console.Write("Media de la fila "+i+": ");
            for(int j=0; j<3; j++){
                suma = suma + c[i,j];
            }
            media=suma/3;
            suma=0;
            Console.WriteLine(media);
        
        }
    }
}