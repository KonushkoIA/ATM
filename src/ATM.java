public class ATM {
    private static int accountMoney = 40000;
    private static boolean workingCapacity = true;
    private static String[] cardType = { "MasterCard", "VISA", "UnionPay", "БЕЛКАРТ" };

    public static int getAccountMoney() {
        return accountMoney;
    }

    public static void setAccountMoney(int accountMoney) {
        ATM.accountMoney = accountMoney;
    }

    public static boolean isWorkingCapacity() {
        return workingCapacity;
    }

    public static void setWorkingCapacity(boolean workingCapacity) {
        ATM.workingCapacity = workingCapacity;
    }

    public static String[] getCardType() {
        return cardType;
    }

    public static void setCardType(String[] cardType) {
        ATM.cardType = cardType;
    }

    public static void checkCardType(String cardTypes){
            boolean flag = false;
            for (String s : cardType) {
                if (s.equals(cardTypes)) {
                    System.out.println("Данный тип карты поддерживается");
                    flag = true;
                }}
                    if (!flag)try {
                        throw new WrongCardTypeException();
                    } catch (WrongCardTypeException e) {
                        System.out.println("Банкомат не предназначен для данного типа карты");
                        System.exit(0);
                    }
    }
}
