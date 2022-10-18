import java.util.Scanner;

public class HomeWork_3_task_2_8 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.8
                        (Текущее время) Листинг 2.7, ShowCurrentTime.java , выдает программу, которая отображает текущее
                        время в GMT. Измените программу таким образом, чтобы она предлагала пользователю ввести смещение
                        часового пояса на GMT и отображала время в указанном часовом поясе.
                        78 страница документации.                                                       */

        Scanner input = new Scanner(System.in);

        System.out.println("Введите смещение часового пояса по Гринвичу: ");
        int offset = input.nextInt();

        // totalMilliseconds Общее количество миллисекунд, прошедших с полуночи 1 января 1970 года.
        long totalMilliseconds = System.currentTimeMillis();

        // totalSeconds общее количество секунд с полуночи 1 января 1970 года
        long totalSeconds = totalMilliseconds / 1000;

        // currentSecond Вычисление текущей секунды в минуте в часе
        long currentSecond = totalSeconds % 60;

        // totalMinutes Общее количество минут
        long totalMinutes = totalSeconds / 60;

        // currentMinute Вычисление текущей минуты в часе
        long currentMinute = totalMinutes % 60;

        // totalHours Общее количество часов
        long totalHours = totalMinutes / 60;

        // currentHour Вычисление текущего часа
        long currentHour = (totalHours % 24) + offset;

        System.out.println("Текущее время составляет: " +currentHour+ ":" +currentMinute+ ":" +currentSecond);
        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}