import java.util.Enumeration;

public abstract class Statement {

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = headerString(aCustomer.getName()); // Método abstrato 1
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            // show figures for this rental
            result += eachRentalString(each); // Método abstrato 2
        }
        // add footer lines
        result += footerString(aCustomer); // Método abstrato 3
        return result;
    }

    public abstract String headerString(String name);

    public abstract String eachRentalString(Rental rental);

    public abstract String footerString(Customer customer);
}