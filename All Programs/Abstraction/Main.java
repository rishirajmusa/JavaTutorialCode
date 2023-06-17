//
//Here you can see that
//we have achieved total absraction
//because main dosen't know how the payment is happening



import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    CreditCard c = new CreditCard();
    Scanner sc = new Scanner(System.in);
    System.out.println("Pay Credit Card bill");
    System.out.println("Choose your option:");
    System.out.println("1)Pay using Debit Card");
    System.out.println("2)Pay using Net Banking");
    System.out.println("3)Pay using UPI");
    System.out.println("4)Pay using Bitcoin Wallet");
    System.out.println("5)Pay using XRP Wallet");
    System.out.println("6)Pay using USDT Wallet");
    System.out.println("7)Pay using BAT Wallet");
    System.out.println("8)Pay using Amazon Pay Later");
    System.out.println("9)Pay using Etherium Wallet");
    System.out.println("10)Pay using Paytm Wallet");
    Integer option = sc.nextInt();
    switch(option){
      case 1:
        c.Pay("DEBIT_CARD");
        break;
      case 2:
        c.Pay("NET_BANKING");
        break;
      case 3:
        c.Pay("UPI");
        break;
      case 4:
        c.Pay("Bitcoin Wallet");
        break;
      case 5:
        c.Pay("XRP Wallet");
        break;
      case 6:
        c.Pay("USDT Wallet");
        break;
      case 7:
        c.Pay("BAT Wallet");
        break;
      case 8:
        c.Pay("Amazon Pay Later");
        break;
      case 9:
        c.Pay("Etherium Wallet");
        break;
      case 10:
        c.Pay("PAYTM_WALLET");
        break;
    }
  }
  
}
