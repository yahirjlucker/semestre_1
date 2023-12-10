import java.util.Random;
public class ProgramaU5_8 {
    public static void main(String[] args) {
        dado();
    }
    public static void dado(){
        Random ale = new Random();
        int x= ale.nextInt(6);
        System.out.println("Numero de la cara del dado: "+x);
    }
}
