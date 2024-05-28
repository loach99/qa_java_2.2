import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int check = 300; // сумма счета
        int price = 1200; // сумма пополнения
        int ratio = 100; // количество рублей за 1 бонус
        int bonus;

        if (price > 1000) { // условие для начисления бонуса
            bonus = price / ratio; // рассчитываем бонус, если условие выполнено
        } else {
            bonus = 0; // рассчитываем бонус, если условие не выполнено
        }

        int total = check + price + bonus; // итоговая сумма вместе с бонусом

        System.out.println("Итоговая сумма на счете: " + total + " ₽"); // по условию задачи мы должны вывести общуюсумму (начальная сумма, пополнение и бонус)

        System.out.println("В том числе бонус за пополнение: " + bonus + " ₽"); // и от дельно сумму бонуса
    }
}