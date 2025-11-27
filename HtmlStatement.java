
public class HtmlStatement extends Statement {

    public String headerString(String name) {
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }

    public String eachRentalString(Rental rental) {
        return rental.getMovie().getTitle() + ": " +
            String.valueOf(rental.getCharge()) + "<BR>\n";
    }

    public String footerString(Customer customer) {
        String result = "<P>You owe <EM>" + String.valueOf(customer.getTotalCharge()) + "</EM></P>\n";
        result += "<P>On this rental you earned <EM>" +
            String.valueOf(customer.getTotalFrequentRenterPoints()) +
            "</EM> frequent renter points</P>";
        return result;
    }
}