import java.util.Scanner;

public class HomeWork_3_task_2_3 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.3
                        (Перевести футы в метры) Напишите программу, которая считывает число в футах, преобразует его
                        в метры и отображает результат. Один фут равен 0,305 метра.                     */
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение футов: ");
        double feet = input.nextDouble();
        double metres = feet * 0.305;
        System.out.println(feet + " Футов равняется " +metres+ " метрам ");
        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}
