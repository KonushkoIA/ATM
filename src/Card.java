public class Card {
    private String cardType;
    private int cardNumber;
    private String owner;
    private int cardMoney;

    public Card(String cardType, int cardNumber, String owner, int cardMoney) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.cardMoney = cardMoney;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getCardMoney() {
        return cardMoney;
    }

    public void setCardMoney(int cardMoney) {
        this.cardMoney = cardMoney;
    }

    public void withdrawMoney(int desiredAmount) {
        if (desiredAmount <= getCardMoney() && desiredAmount <= ATM.getAccountMoney()) {
            System.out.println("Деньги сняты");
            cardMoney = cardMoney - desiredAmount;
        } else if (desiredAmount > getCardMoney()) {
            try {
                throw new LackMoneyException();
            } catch (LackMoneyException e) {
                System.out.println("Недостаточно средст на карте");
            }
        } else if (desiredAmount > ATM.getAccountMoney()) {
            try {
                throw new LackMoneyException();
            } catch (LackMoneyException e) {
                System.out.println("Недостаточно средст в банкомате");
            }
        }
    }

    public void seeAccountBalance() {
        System.out.println(getCardMoney());
    }
}
