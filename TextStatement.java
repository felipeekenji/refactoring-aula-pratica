
public class TextStatement extends Statement {

    public String headerString(String name) {
        return "Rental Record for " + name + "\n";
    }

    public String eachRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle()+ "\t" +
            String.valueOf(rental.getCharge()) + "\n";
    }

    public String footerString(Customer customer) {
        String result = "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) +
                 " frequent renter points";
        return result;
    }
}