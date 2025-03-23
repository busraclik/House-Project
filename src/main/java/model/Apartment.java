package main.java.model;

import java.math.BigDecimal;

public class Apartment extends House {
    private int floor;

    public Apartment(int roomCount, int livingRoomCount, BigDecimal price, double squareMeter, int floor) {
        super(roomCount, livingRoomCount, price, squareMeter);
        this.floor = floor;
    }


    @Override
    public String toString() {
        return super.toString() + ", Floor : " + this.floor;
    }
}
