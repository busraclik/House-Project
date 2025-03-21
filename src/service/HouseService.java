package service;

import model.Apartment;
import model.HolidayHome;
import model.House;
import model.Villa;
import java.util.List;

public interface HouseService {
    List<House> getHouseList();

    List<Apartment> getApartmentList();

    List<Villa> getVillaList();

    List<HolidayHome> getHolidayHomeList();

    double totalPrice(List<? extends House> houses);

    double averageTotalSquareMeter(List<? extends House> houses);

    List<House> filterHousesByRoomAndLivingRoom(int minRooms, int minLivingRooms, List<? extends House> houses);
}
