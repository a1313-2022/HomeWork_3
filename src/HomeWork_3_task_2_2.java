import java.util.Scanner;

public class HomeWork_3_task_2_2 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.2
                        (Вычислить объем цилиндра) Напишите программу, которая считывает радиус
                        и длину цилиндра и вычисляет площадь и объем, используя следующие формулы:
                        area = radius * radius * π
                        volume = area * length                                                          */

        Scanner input = new Scanner(System.in);
        final double PI = 3.1415926535;

        System.out.println("Введите значение радиуса: ");
        double radius = input.nextDouble();

        System.out.println("Введите значение длины: ");
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("Площадь составляет: " +area+ "\n"+
                           "Объём составляет: " +volume);

        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}