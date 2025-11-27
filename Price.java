public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
    
    // MÉTODO CONCRETO E GENÉRICO (agora não é mais abstrato)
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}