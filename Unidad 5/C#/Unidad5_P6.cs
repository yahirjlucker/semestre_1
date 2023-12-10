namespace ProgramaU5_6;

class Secuencia{
    static void Main(string[] args){
        f();
    }
    public static void f() {
        int a=0, b=1, c=0;
        for(int i=0; i<=10; i++){
            Console.Write(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}