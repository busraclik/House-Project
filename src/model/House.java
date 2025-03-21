package model;

public class House {
    private int roomCount;
    private int livingRoomCount;
    private double price;
    private double squareMeter;

    public House(int roomCount, int livingRoomCount, double price, double squareMeter) {
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
        this.price = price;
        this.squareMeter = squareMeter;
    }


    public int getRoomCount() {
        return roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    public double getPrice() {
        return price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    @Override
    public String toString() {
        return  "House Type : " + this.getClass().getSimpleName() +
                ", "+
                " Rooms = " + roomCount +
                ", Living Rooms = " + livingRoomCount +
                ", Price = " + price +
                ", Square Meter = " + squareMeter;
    }
}
