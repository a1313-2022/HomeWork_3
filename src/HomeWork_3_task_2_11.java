import java.util.Scanner;

public class HomeWork_3_task_2_11 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.11
                        (Прогноз численности населения) Перепишите упражнение по программированию 1.11, чтобы предложить
                        пользователю ввести количество лет и отобразить численность населения после количества лет.
                        Используйте подсказку в упражнении по программированию 1.11 для этой программы. */

        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество лет которое должно пройти для расчета : ");
        int laterYears = input.nextInt();

        // 365 дней * 24 часа * 60 минут * 60 секунд = 31536000 секунд в году
        int secondsYear = 31536000;

        // Секунды в год делим на секунды рождения
        int birthsYear = secondsYear / 7;

        // Секунды в год делим на секунды смерти
        int deathsYear = secondsYear / 13;

        // Секунды в год делим на секунды прибывания иммигранта
        int immigrantsYear = secondsYear / 45;

        int people = 312032486 + (((birthsYear) - (deathsYear) + (immigrantsYear)) * laterYears);

        System.out.println( "Население через : " +laterYears+ " лет составляет " +people+ " человек");
        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}