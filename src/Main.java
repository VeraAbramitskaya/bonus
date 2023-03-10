public class Main {
    public static void main(String[] args) {
        int price = 15_000;
        // Стоимость билета
        int rubblesForMile = 20;
        // количество рублей для одной бонусной мили
        int bonus;
        bonus = price / rubblesForMile;
        //расчет бонусов
        System.out.println("Начислено бонусов:" + bonus);
        //Вывод на экран количества бонусов за покупку билета
    }
}