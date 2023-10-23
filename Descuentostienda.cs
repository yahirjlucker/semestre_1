using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Descuentostienda
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello Hospy!");
            double p1, p2, p3, total;
            Console.WriteLine("Escribe el valor del producto 1");
            p1 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Escribe el valor del producto 2");
            p2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Escribe el valor del producto 3");
            p3 = Convert.ToDouble(Console.ReadLine());
            total = p1 + p2 + p3;

            if (total >= 1500)
            {
                total = total - (total * 0.3);
                Console.WriteLine("Su total de 30% de descuento:" + total);
            }
            else if (total < 1500 && total >= 100)
            {
                total = total - (total * 0.2);
                Console.WriteLine("Su total de 20% de descuento:" + total);
            }
            else if (total < 1000 && total >= 700)
            {
                total = total - (total * 0.1);
                Console.WriteLine("Su total de 10% de descuento:" + total);
            }
            else
            {
                Console.WriteLine("Su total es " + total);
            }

        }
    }









}
