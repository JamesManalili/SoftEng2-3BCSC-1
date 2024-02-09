public class GCash implements PaymentType {

    @Override
    public String calculatePayment() {
        String output = new String();
        output += "GCash is your payment type!\n" +
                  "You earn 10 energy points";
        return output;
        
    }
    
}
