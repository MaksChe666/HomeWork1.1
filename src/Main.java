public class Main {
    public static void main(String[] args) {
        int priceTicket = 19800; // стоимость билета
        int priceMile = 33; // стоимость мили

        int miles; // переменная
        if (priceTicket < 0) {
            System.out.println("Не может быть отрицательного значения");
        } else {
            miles = priceTicket / priceMile; // кол-во миль
            System.out.println(miles); // результат
        }

    }
}