using System;
namespace ProgramaU4_13;

class Matriz{
    static void Main(string[] args){
        double[,] temp = new double[5,7];
        double[,] f = new double[5,7];

        //Entrada de valaores
        for(int i=0; i<5; i++){
            for(int j=0; j<7; j++){
                Console.Write("("+i+")("+j+") Grados centigrtados: ");
                temp[i,j] = Convert.ToDouble(Console.ReadLine());
            }
        }
        Console.WriteLine("");
        //Converiones
        for(int k=0; k<5; k++){
            for(int j=0; j<7; j++){
                /*Puse (float) ya que me decía que no se puede convertir en double a float y ya mejor de ver que
                  era le puese eso */
                f[k,j]=(float)((temp[k,j]*1.8)+32);
            }
        }
        //Imprimir resultados
        for(int l=0; l<5; l++){
            for(int j=0; j<7; j++){
                if(j==6){
                    Console.WriteLine("("+l+")("+j+") "+temp[l,j]+" C° equivale a: "+f[l,j]+" F°");
                    Console.WriteLine("");
                }else{
                    Console.WriteLine("("+l+")("+j+") "+temp[l,j]+" C° equivale a: "+f[l,j]+" F°");
                }
            }
        }
    }
}