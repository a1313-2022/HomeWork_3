import java.util.Scanner;

public class HomeWork_3_task_2_4 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.4
                        (Перевести фунты в килограммы) Напишите программу, которая преобразует фунты в
                        килограммы. Программа предлагает пользователю ввести число в фунтах, преобразует его
                        в килограммы и отображает результат. Один фунт равен 0,454 килограмма.          */

        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение фунтов: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println(pounds + " Фунтов равняется " +kilograms+ " килограммам");

        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}
