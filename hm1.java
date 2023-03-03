// Написать программу вычисления n-ого треугольного числа
import java.util.Scanner;  // бибилиотека по получению данных от пользователя с консоли
public class hm1 {
    public static void main (String[] args) {
        Scanner Scanner = new Scanner (System.in );
        System.out.print("Введите число : ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }
    
    public static int Triangle(int numb) {
        if (numb == 1) {
            
        }
        return  (numb - 1) + numb;
    }
}