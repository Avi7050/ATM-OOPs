class ATM {
    static String bank = "State Bank of India";
    String holderName;
    String account;
    double amount;
    double balance;

    public ATM(String account, String holderName) {
        this.account = account;
        this.holderName = holderName;
    }

    @Override
    public String toString() {
        return "ATM [bank=" + bank + ", Name= " + holderName + ", account= " + account + "]";
    }

    public double displayAmount(double amount) {
        return amount;
    }

    public double depositAmount(double amount) {
        return balance += amount;
    }

    public double withdrawAmount(double amount) {
        return balance -= amount;
    }

    public static void main(String[] args) {
        ATM atm = new ATM("9999XXXX111222", "Avinash");
        String ac = atm.toString();
        System.out.println(ac);
        atm.depositAmount(10000);
        System.out.println("Amount balance: " + atm.balance);
        atm.depositAmount(5000);
        System.out.println("Amount balance: " + atm.balance);
        atm.withdrawAmount(3000);
        System.out.println("Amount balance: " + atm.balance);

    }
}