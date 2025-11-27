public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    // Implementa a lógica de bônus (1 ponto + 1 bônus se alugado por > 1 dia)
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1; 
        
        // Alternativa com if/else:
        // if (daysRented > 1) {
        //     return 2;
        // } else {
        //     return 1;
        // }
    }
}