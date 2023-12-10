public class ProgramaU5_1 {
        public static void main(String[] args) {
        System.out.println ("Suma:" + suma (7, 8));
        System.out.println ("Resta: " + resta (10, 3));
        System.out.println ("Multiplicacion: " + multi (11, 2));
        System.out.println ("Division: " + div (224, 2));
      }
      public static int suma (int a, int b)
      {
        int s = a + b;
        return s;
      }
      public static int resta (int a, int b)
      {
        int r = a - b;
        return r;
      }
      public static int multi (int a, int b)
      {
        int m = a * b;
        return m;
      }
      public static int div (int a, int b)
      {
        int d = a / b;
        return d;
      }
    }

