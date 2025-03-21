package service;

import model.Apartment;
import model.HolidayHome;
import model.House;
import model.Villa;
import repository.HouseRepository;

import java.util.List;
import java.util.stream.Collectors;

public class HouseServiceImpl implements HouseService {
    private final HouseRepository houseRepository;

    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public List<House> getHouseList() {
        return houseRepository.getHouseList();

    }

    public List<Apartment> getApartmentList() {
        return houseRepository.getApartmentList();
    }

    @Override
    public List<Villa> getVillaList() {
        return houseRepository.getVillaList();
    }

    @Override
    public List<HolidayHome> getHolidayHomeList() {
        return houseRepository.getHolidayHomeList();
    }

    @Override
    public double totalPrice(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getPrice).sum();
    }

    @Override
    public double averageTotalSquareMeter(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getSquareMeter).average().orElse(0.0);
    }

    @Override
    public List<House> filterHousesByRoomAndLivingRoom(int minRooms, int minLivingRooms, List<? extends House> houses) {
        return houses.stream()
                .filter(house -> house.getRoomCount() >= minRooms)
                .filter(house -> house.getLivingRoomCount() >= minLivingRooms)
                .collect(Collectors.toList());
    }
}
