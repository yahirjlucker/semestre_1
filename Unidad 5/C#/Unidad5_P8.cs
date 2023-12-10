namespace ProgramaU5_8;
class Simulador{
    static void Main(string[] args){
        dado();
    }
    public static void dado(){
        //Mismo de JAVA y no necesita una liberia
        Random ale = new Random();
        //NombreDeMetodo.Next(desde,hasta);
        //7 se excluyen
        int x= ale.Next(1,7);
        Console.WriteLine("Numero de la cara del dado: "+x);
    }
}