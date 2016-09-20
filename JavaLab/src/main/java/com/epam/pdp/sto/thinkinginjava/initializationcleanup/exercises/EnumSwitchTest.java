package com.epam.pdp.sto.thinkinginjava.initializationcleanup.exercises;

/**
 * Created by Best on 14.08.2016.
 * Exercise 22: (2) Write a switch statement for the enum in the previous example.
 * For each case, output a description of that particular currency.
 */
public class EnumSwitchTest {
    Currency money;

    public EnumSwitchTest(Currency money) {
        this.money = money;
    }

    public void describe() {
        System.out.println("This currency is: ");
        switch (money)         {
            case ONE:
                System.out.println("Одна гривня");
                break;
            case TWO:
                System.out.println("Дві гривні");
                break;
            case FIVE:
                System.out.println("П'ять гривень");
                break;
            case TEN:
                System.out.println("Десять гривень");
                break;
            case TWENTY:
                System.out.println("Двадцять гривень");
                break;
            default:
                System.out.println("Гривні");
        }
    }

    public static void main(String[] args) {
        EnumSwitchTest cur1 = new EnumSwitchTest(Currency.TEN);
        EnumSwitchTest cur2 = new EnumSwitchTest(Currency.ONE);
        cur1.describe();
        cur2.describe();
    }
}
/**Output:
 *This currency is:
 *  Десять гривень
 *  This currency is:
 *  Одна гривня
 */
