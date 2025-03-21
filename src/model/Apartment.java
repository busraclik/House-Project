package model;

public class Apartment extends House{
    private int floor;

    public Apartment(int roomCount, int livingRoomCount, double price, double squareMeter, int floor) {
        super(roomCount, livingRoomCount, price, squareMeter);
        this.floor = floor;
    }


    @Override
    public String toString() {
        return super.toString() + ", Floor : " + this.floor;
    }
}
