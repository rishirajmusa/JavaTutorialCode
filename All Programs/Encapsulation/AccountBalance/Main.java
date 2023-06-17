class Main {
  public static void main(String[] args) {
    Account a=new Account(100);
    a.deposit(100);
    a.withdraw(150);
  }
}
//Wgat is encapsulation
//Encapsulation is not done just for security
//Security is one of the add ons provided by encapsulation
//it's just that you are binding the data and relative methods into one unit
//it keeps data and methods safe from external interference
//it's done by making data variables private so the data remains hidden
//data is hidden from direct access but not completely hidden
//you can still make changes to the data in a right way 
//in a way which was pre defined by the programmer
//as given in this example
//you can't just change the account balance
//you have to withdraw or deposit to change the data
