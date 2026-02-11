public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int depozitAmount = 1200;
        int bonusThreshold = 1000;
        int bonus = 100;
        int bonusRubles;
        int finalBalance;


        if (depozitAmount > bonusThreshold) {
            bonusRubles = depozitAmount / bonus;
        } else {
            bonusRubles = 0;
        }

        finalBalance = initialBalance + depozitAmount + bonusRubles;

        System.out.println("Итоговая сумма на счету: " + finalBalance + " руб.");

    }

}