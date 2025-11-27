public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
    // NOVO MÉTODO ABSTRATO
    public abstract int getFrequentRenterPoints(int daysRented); 
}