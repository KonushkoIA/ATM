public class Menu {
    int num1 = getInt();

    public int getInt(){
        int num;
        try{
            String enteredValue = Main.scanner.nextLine();
            num = Integer.parseInt(enteredValue);
            if (num <= 0) {
                System.out.println("Вы ввели некорректные данные");
                System.out.println("Введите сумму заново");
                num = getInt();
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            num = getInt();
        }
        return num;
    }

    public void choice(Card c) {
        if (num1 == 1) {
            System.out.println("Введите сумму");
            c.withdrawMoney(getInt());
        }
        else if (num1 == 2) {
            c.seeAccountBalance();
        }
        else if (num1 == 3) {
            Main.flag = false;
            Main.scanner.close();
            System.out.println("Конец работы с банкоматом");
        }
        else {
            System.out.println("Оперции под таким номером не существует");
        }
    }
}
