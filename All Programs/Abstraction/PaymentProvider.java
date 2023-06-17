public class PaymentProvider {
	
   public static Payment getPayment(String paymentType){
      if(paymentType == null){
         return null;
      }		
       switch(paymentType){
      case "DEBIT_CARD":
        return new DebitCardHandler();      
      case "NET_BANKING":
        return new NetBankingHandler();    
      case "UPI":
       return new UPIHandler();   
      case "PAYTM_WALLET":
       return new PaytmHandler();
      case "Bitcoin Wallet":
       return new BitcoinHandler();
      case "XRP Wallet":
       return new XRPHandler();
      case "USDT Wallet":
       return new UsdtHandler();
      case "BAT Wallet":
       return new BATHandler();
      case "Amazon Pay Later":
       return new AmazonPayLaterHandler();
      case "Etherium Wallet":
       return new EtheriumHandler();
    }
    return null;
   }
}