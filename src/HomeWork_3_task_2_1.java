import java.util.Scanner;

public class HomeWork_3_task_2_1 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                  */

            /* task 2.1
                        (Преобразовать градус Цельсия в градус Фаренгейта) Напишите программу, которая считывает градус
                        Цельсия в двойном значении с консоли, затем преобразует его в градус Фаренгейта и отображает
                        результат. Формула для преобразования выглядит следующим образом:
                        fahrenheit = (9 / 5) * celsius + 32
                                                                                                       */
        Scanner input = new Scanner(System.in);

        System.out.println("Введите значение температуры в градусах по цельсию");
        double celsius = input.nextDouble();
        double fahrenheit = 9.0 / 5 * celsius + 32;

        System.out.println("Температура в градусах под цельсию составляет " +celsius+
                           " Это значение по фаренгейту равно " +fahrenheit);

        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}