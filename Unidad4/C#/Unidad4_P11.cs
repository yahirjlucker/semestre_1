using System;
namespace ProgramaU4_11;

class Matriz{
    static void Main(string[] args){
        int[,] m = {{10,56,12},{43,41,9},{2,4,8}};

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
               Console.Write(m[i,j]+" ");
            }
        }
    }
}