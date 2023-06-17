class Account { // minBalance= 1000
 private double balance;
 private int accountNumber;

Account(int balance)
{
this.balance=balance;
}

 public void deposit(double a){
    if ( a <= 0  ){
      System.out.println("a should be > 0");
      return;
    }
    balance = balance + a;
   System.out.println("Updated Balance : "+ balance);
 }
 public void withdraw(double a){
    if ( a <= 0  ){
      System.out.println("a should be > 0");
      return;
    }
    if (balance - a < 0 ){
      System.out.println("“Insufficient funds”");
      return;
    }
    balance = balance - a;
   System.out.println("Remaining Balance : "+ balance);
 }
}

