import java.util.Scanner;

public class HomeWork_3_task_2_12 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.12
                        (Физика: определение длины взлетно-посадочной полосы) Учитывая ускорение самолета a и скорость
                        взлета v, можно узнать минимальную длину взлетно-посадочной полосы, необходимую самолету для
                        взлета, используя следующую формулу: length = v2 / 2a Напишите программу, которая предложит
                        пользователю ввести v в метрах в секунду (м/с) и ускорение a в метрах в секунду в квадрате
                        (м/с2), затем отобразит минимальную длину взлетно-посадочной полосы.            */

        Scanner input = new Scanner(System.in);

        System.out.println("Введите значение скорости взлета самолета в метрах в секунду: ");
        double speed = input.nextDouble();

        System.out.println("Введите значение ускорения самолета в метрах в секунду: ");
        double acceleration = input.nextDouble();

        double length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println( "Минимальная длина взлетно-посадочной полосы для взлета самолета" +
                            " при скорости: "   +speed+
                            " и ускорении: "    +acceleration+
                            " составляет: "     +length);
        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}