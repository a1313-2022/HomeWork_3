import java.util.Scanner;

public class HomeWork_3_task_2_10 {
    public static void main(String[] args) {
        /*  start   HomeWork    09 октября 2022 года.                                                   */

            /* task 2.10
                        (Наука: расчет энергии) Напишите программу, которая вычисляет энергию, необходимую для нагрева
                        воды от начальной температуры до конечной. Ваша программа должна предложить пользователю ввести
                        количество воды в килограммах, а также начальную и конечную температуры воды. Формула для
                        вычисления энергии такова Q = M * (finalTemperature – initialTemperature) * 4184
                        где M - вес воды в килограммах, а энергия Q измеряется в джоулях.               */
        Scanner input = new Scanner(System.in);

        System.out.println("Введите значение количества воды в килограммах: ");
        double waterMass = input.nextDouble();
        System.out.println("Введите значение начальной температуры воды в градусах под цельсию: ");
        double initialTemperature = input.nextDouble();
        System.out.println("Введите значение конечной температуры воды в градусах под цельсию: ");
        double finalTemperature = input.nextDouble();

        double currentEnergyJoules = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println( "Количество воды составляет: " +waterMass+ " килограммов"+
                            "\nНачальная температура воды составляет: " +initialTemperature+ " градусов под цельсию"+
                            "\nКонечная температура воды составляет: " +finalTemperature+ " градусов под цельсию"+
                            "\nНеобходимое количество энергии для нагрева воды в джоулях составляет " +currentEnergyJoules);
        /*  end     HomeWork    09 октября 2022 года.                                                   */
    }
}