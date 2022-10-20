import java.util.Scanner;

public class HomeWork_3_task_2_7 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.7
                        (Найдите количество лет) Напишите программу, которая предложит пользователю ввести минуты
                        (например, 1 миллиард) и отобразит максимальное количество лет и оставшихся дней для минут.
                        Для простоты предположим, что в году 365 дней.                                  */
        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество минут: ");
        int enterMinutes = input.nextInt();

        int years = enterMinutes / 525600;
        int days = (enterMinutes % 525600) / 1440;

        System.out.println("Количество минут составляет: "                      +enterMinutes+
                           "\nИз этого значения количество лет составляет: "    +years+
                           "\nИз этого значения количество дней составляет: "   +days);
        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}