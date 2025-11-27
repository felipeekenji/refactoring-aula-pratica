public class ChildrensPrice extends Price {
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
    
    // Retorna o valor base de 1 ponto
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}