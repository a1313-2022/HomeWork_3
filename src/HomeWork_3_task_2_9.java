import java.util.Scanner;

public class HomeWork_3_task_2_9 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.9
                        (Физика: ускорение) Среднее ускорение определяется как изменение скорости, деленное на время,
                        затраченное на изменение, как указано в следующей формуле: a = v1 - v0 / t
                        Напишите программу, которая предложит пользователю ввести начальную скорость v0 в метрах/
                        во-вторых, конечная скорость v1 в метрах в секунду и промежуток времени t в секундах, затем
                        отображается среднее ускорение.                                                 */
        Scanner input = new Scanner(System.in);

        System.out.println("Введите значение начальной скорости v0: ");
        double enterV0 = input.nextDouble();
        System.out.println("Введите значение конечной скорости v1: ");
        double enterV1 = input.nextDouble();
        System.out.println("Введите значение промежутка времени t: ");
        double enterT = input.nextDouble();

        double average = enterV1 - enterV0 / enterT;

        System.out.println( "Начальная скорость в метрах составляет: "      +enterV0+
                            "\nКонечная скорость в метрах составляет: "     +enterV1+
                            "\nПромежуток времени в секундах составляет: "  +enterT+
                            "\nСреднее ускорение составляет "               +average);
        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}