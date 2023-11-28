using System;
namespace ProgramaU4_9;

class Nombres{
    static void Main(string[] args){
        string[] nombre = new string[1];
        string[] apellidos = new string[1];
        string[] c = new string[2];

        Console.Write("Escibra su nombre(s): ");
        nombre[0] = Console.ReadLine();
        Console.Write("Escriba sus apelldios: ");
        apellidos[0] = Console.ReadLine();

        c[0]=nombre[0];
        c[1]=apellidos[0];

        Console.Write("Nombre completo: "+c[0]+" "+c[1]);

    }
}