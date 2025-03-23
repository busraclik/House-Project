package main.java.model;

import java.math.BigDecimal;

public class Villa extends House {
    private boolean hasGarden;

    public Villa(int roomCount, int livingRoomCount, BigDecimal price, double squareMeter, boolean hasGarden) {
        super(roomCount, livingRoomCount, price, squareMeter);
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return super.toString() + ", Has garden: " + (this.hasGarden ? "Yes" : "No");
    }
}
