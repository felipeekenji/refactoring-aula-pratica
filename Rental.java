public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double getCharge() {
        return _movie.getCharge(getDaysRented()); 
    }

    // Método getFrequentRenterPoints() simplificado para delegar a chamada a Movie
    public int getFrequentRenterPoints() {
        // Usa o método getFrequentRenterPoints() da classe Movie, passando daysRented
        return _movie.getFrequentRenterPoints(getDaysRented()); 
    }
}