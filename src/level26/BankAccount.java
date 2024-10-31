package level26;

import java.math.BigDecimal;

public class BankAccount {
    private BigDecimal balance;
    private String owner;

    public BankAccount(String owner) {
        this(BigDecimal.ZERO, owner);
    }

    public BankAccount(BigDecimal balance, String owner) {
        this.owner = owner;
        this.balance = balance;
    }

    public synchronized void deposit(BigDecimal money) {
        BigDecimal newBalance = balance.add(money);
        System.out.println("Добавляем " + money + ", на счету " + newBalance);
        balance = newBalance;
    }

    public synchronized void withdraw(BigDecimal money) throws NotEnoughMoneyException{
        BigDecimal newBalance = balance.subtract(money);
        if (newBalance.compareTo(BigDecimal.ZERO) < 0) {throw new NotEnoughMoneyException();}
        balance = newBalance;
        System.out.println("Поток "+Thread.currentThread().getName() +"Тратим " + money + ", на счету " + newBalance);
    }

    public void deposit(String money) {
        deposit(new BigDecimal(money));
    }

    public void withdraw(String money) throws NotEnoughMoneyException {
        withdraw(new BigDecimal(money));
    }


}
