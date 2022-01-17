import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    static boolean flag = true;
    public static void main(String[] args) {
        if (ATM.isWorkingCapacity()) {
            System.out.println("Банкомат работает");
        } else {
            System.out.println("Банкомат не работает");
            System.exit(0);
        }
        User user = new User("Pavel");
        Card card = new Card("VISA", 12345, "Andrey", 50000);
        user.setCard(card);
        ATM.checkCardType(user.getCard().getCardType());
        System.out.println("1. Снять деньги");
        System.out.println("2. Посмотреть остаток средст на карте");
        System.out.println("3. Закончить работу");
        while (flag){
            System.out.println("Введите номер желаемого дествия:");
            Menu menu = new Menu();
            menu.choice(card);
        }
    }
}
