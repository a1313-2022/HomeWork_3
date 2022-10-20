import java.util.Scanner;

public class HomeWork_3_task_2_6 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.6
                        (Суммируйте цифры в целое число) Напишите программу, которая считывает целое число от 0
                        до 1000 и добавляет все цифры в целое число. Например, если целое число равно 932, то сумма всех
                        его цифр равна 14. Подсказка: Используйте оператор % для извлечения цифр и используйте оператор
                        / для удаления извлеченной цифры. Например, 932 % 10 = 2 и 932/10 = 93.         */

        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение от 0 до 1000: ");
        int selectNumber = input.nextInt();

        int add1value = selectNumber % 10;                                              // Единицы
        selectNumber /= 10;
        int add2value = selectNumber % 10;                                              // Десятки
        selectNumber /= 10;
        int add3value = selectNumber % 10;                                              // Сотни

        int total = add1value + add2value + add3value;

        System.out.println("\nПервое значение из сотен: "       +add3value+
                           "\nВторое значение из десятков: "    +add2value+
                           "\nТретье значение из единиц: "      +add1value+
                           "\n\nСумма трёх значений " +add3value+ " + " +add2value+ " + " +add1value+ " равняется " +total);
        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}