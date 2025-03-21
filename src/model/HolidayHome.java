package model;

public class HolidayHome extends House{
    private boolean hasPool;

    public HolidayHome(int roomCount, int livingRoomCount, double price, double squareMeter, boolean hasPool) {
        super(roomCount, livingRoomCount, price, squareMeter);
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return super.toString() + ", Has Pool: " + (this.hasPool ? "Yes" :"No");
    }
}
