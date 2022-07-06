public class main {

    public static void main(String[] args) {
        int balance = 500;
        int sum = 1000;
        int buy = 1100;
        int rule = 100;
        int bonus;

        if (buy > sum) {
            bonus = buy/rule;
        }
        else {bonus = 0;
        }
        balance = balance + buy + bonus;

        System.out.println("Итоговый счет " + balance);
        System.out.println("Количество бонусных рублей " + bonus);
    }
}

