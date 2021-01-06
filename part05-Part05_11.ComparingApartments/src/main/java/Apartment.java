
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared) {
        int priceDiff = (this.squares * this.princePerSquare) - (compared.squares * compared.princePerSquare);
        if(priceDiff > 0) {
            return priceDiff;
        } else {
            return priceDiff * -1;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int priceDiff = (this.squares * this.princePerSquare) - (compared.squares * compared.princePerSquare);
        return priceDiff > 0;
    }
}
