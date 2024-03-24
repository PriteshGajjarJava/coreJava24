public class BankingApp {
    public static void main(String[] args) {  
      Account act1 = new Account(110, 20000);
      Account act2 = new Account(223, 15000);
      Account act3 = new Account(454, 30000);
      // Scenario where multiple threads are doing Critical operation on DIFFERENT object/account
      TransactionThread t1 = new TransactionThread(act1, OperationType.DEPOSITE, 12000);
      TransactionThread t2 = new TransactionThread(act2, OperationType.WITHDRAWL, 5000);
      TransactionThread t3 = new TransactionThread(act3, OperationType.CHECK_BALANCE);
      t1.start();
      t2.start();
      t3.start();

      // Scenario where multiple threads are doing CRITICAL operation on SAME object/account (a4)
      Account act4 = new Account(899, 20000);
      TransactionThread t4 = new TransactionThread(act4, OperationType.WITHDRAWL, 4000);
      TransactionThread t5 = new TransactionThread(act4, OperationType.DEPOSITE, 7000);
      t4.start();
      t5.start();
    }
}


class TransactionThread extends Thread {
  Account act;
  OperationType type;
  float amt; // amount to be deposited/withrawl

  TransactionThread(Account act, OperationType type, float amt) {
    this.act = act;
    this.type = type;
    this.amt = amt;
  }
  TransactionThread(Account act, OperationType type) {
    this.act = act;
    this.type = type;
  }
  @Override
  public void run() {
    switch (type) {
      case WITHDRAWL: this.act.withdrawl(this.amt); break;
      case DEPOSITE: this.act.deposite(this.amt); break;
      case CHECK_BALANCE: this.act.printBalance(); break;
    }
  }
}

enum OperationType {
  WITHDRAWL,
  DEPOSITE,
  CHECK_BALANCE
}

class Account {
  int actNo;
  float balance;

  Account(int actNo, float balance) {
    this.actNo = actNo;
    this.balance = balance;
  }

  synchronized void deposite(float amt) {
    if (amt < 0) {
      System.out.println("invalid deposite amt");
      return;
    }

    System.out.println("["+this.actNo + "]: Amount before Deposite: " + this.balance);
    this.balance += amt;
    System.out.println("["+this.actNo + "]: Amount after Deposite: " + this.balance);
  }

  synchronized void withdrawl(float amt) {
    if (amt > this.balance) {
      System.out.println("invalid withdrawl amt");
      return;
    }
    System.out.println("["+this.actNo + "]:Amount before Withdrawl: " + this.balance);
    this.balance -= amt;
    System.out.println("["+this.actNo + "]:Amount after Withdrawl: " + this.balance);
  }

  void printBalance() {
    System.out.println("["+this.actNo + "]:Current balance is: " + this.balance);
  }
}
