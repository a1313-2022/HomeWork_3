import java.util.Scanner;

public class HomeWork_3_task_2_5 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.5
                        (Финансовое приложение: рассчитайте чаевые) Напишите программу, которая считывает промежуточный
                        итог и размер чаевых, а затем вычисляет чаевые и общую сумму. Например, если пользователь вводит
                        10 для промежуточного итога и 15% для ставки чаевых, программа отображает 1,5 доллара в качестве
                        чаевых и 11,5 доллара в качестве общей суммы.                                   */

        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение промежуточного итога: ");
        double subtotal = input.nextDouble();
        System.out.println("Введите значение чаевой ставки: ");
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        System.out.println("Чаевые составляют " + gratuity + "\nОбщая сумма составляет " + total);


        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}
