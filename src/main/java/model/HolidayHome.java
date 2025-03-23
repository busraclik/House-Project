package main.java.model;

import java.math.BigDecimal;

public class HolidayHome extends House {
    private boolean hasPool;

    public HolidayHome(int roomCount, int livingRoomCount, BigDecimal price, double squareMeter, boolean hasPool) {
        super(roomCount, livingRoomCount, price, squareMeter);
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return super.toString() + ", Has Pool: " + (this.hasPool ? "Yes" : "No");
    }
}
