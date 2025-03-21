package model;

public class Villa extends House{
    private boolean hasGarden;

    public Villa(int roomCount, int livingRoomCount, double price, double squareMeter, boolean hasGarden) {
        super(roomCount, livingRoomCount, price, squareMeter);
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return super.toString() + ", Has garden: " + (this.hasGarden ? "Yes" : "No") ;
    }
}
