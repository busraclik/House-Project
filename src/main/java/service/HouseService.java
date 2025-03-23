package main.java.service;

import main.java.model.Apartment;
import main.java.model.HolidayHome;
import main.java.model.House;
import main.java.model.Villa;

import java.math.BigDecimal;
import java.util.List;

public interface HouseService {
    List<House> getHouseList();

    List<Apartment> getApartmentList();

    List<Villa> getVillaList();

    List<HolidayHome> getHolidayHomeList();

    BigDecimal totalPrice(List<? extends House> houses);

    double averageTotalSquareMeter(List<? extends House> houses);

    List<House> filterHousesByRoomAndLivingRoom(int minRooms, int minLivingRooms, List<? extends House> houses);
}
