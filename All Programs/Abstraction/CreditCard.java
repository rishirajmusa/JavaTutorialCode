//in main class we used credit card object 
//and used it to call the respective payment methods
//we used interface payment and used that to call the payment methods from another class
//called payment provider
//in this way we have achieved total abstracion of payment options from credit card class
//in this way process is happening but credit card dosen't know hoe its happening
public class CreditCard{
  /*
  .
  .
  Rest of the card methods
  .
  .
  */
  public void Pay(String paymentType){
    Payment payment = PaymentProvider.getPayment(paymentType);
    payment.pay();
  }

}
