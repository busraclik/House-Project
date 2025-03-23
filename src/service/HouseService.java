package service;

import model.Apartment;
import model.HolidayHome;
import model.House;
import model.Villa;

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
