using System;
namespace ProgramaU4_16;

class Datos{
    static void Main(string[] args){
        String[,] p = {{"Hector","Darien","Gael"},{"Manuel","Ricardo","Jose"}};
        Console.Write("Matriz: ");
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                Console.Write(p[i,j]+" ");
            }
        }
        Console.WriteLine("");
        Console.Write("Matiz al reves: ");
        for(int i=1; i>=0; i--){
            for(int j=2; j>=0; j--){
                Console.Write(p[i,j]+" ");
            }
        }
    }
}
