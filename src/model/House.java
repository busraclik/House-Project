package model;

import formatter.CurrencyFormatter;

import java.math.BigDecimal;

public class House {
    private int roomCount;
    private int livingRoomCount;
    private BigDecimal price;
    private double squareMeter;

    public House(int roomCount, int livingRoomCount, BigDecimal price, double squareMeter) {
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

    public BigDecimal getPrice() {
        return price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    @Override
    public String toString() {
        return "House Type : " + this.getClass().getSimpleName() +
                ", " +
                " Rooms = " + roomCount +
                ", Living Rooms = " + livingRoomCount +
                ", Price = " + CurrencyFormatter.formatCurrency(price) +
                ", Square Meter = " + String.format("%.2f m²", squareMeter);
    }

}
