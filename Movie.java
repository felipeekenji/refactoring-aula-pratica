public class Movie {
    // ... (atributos, construtor, get/setPriceCode, getTitle, getCharge inalterados) ...
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private Price _price;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }
    // ... (resto da classe Movie) ...

    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    // MÉTODO MODIFICADO: Delega a chamada para o objeto _price
    public int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }
}