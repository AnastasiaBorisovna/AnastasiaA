public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int initialAccount = 500;
        int amountDeposit = 1200;
        int bonus;

        if (amountDeposit > 1000) {
            bonus = amountDeposit / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Вам начислено: ");
        System.out.println((bonus) + "рублей");

        System.out.println((initialAccount + amountDeposit + bonus) + " Сумма на счету");

    }

}