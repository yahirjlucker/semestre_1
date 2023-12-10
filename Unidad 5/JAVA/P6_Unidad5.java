public class ProgramaU5_6 {
    public static void main(String[] args) {
        f();
    }
    public static void f() {
        int a=0, b=1, c=0;
        for(int i=0; i<=10; i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
