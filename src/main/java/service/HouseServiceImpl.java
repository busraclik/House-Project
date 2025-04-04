package main.java.service;

import main.java.model.Apartment;
import main.java.model.HolidayHome;
import main.java.model.House;
import main.java.model.Villa;
import main.java.repository.HouseRepository;

import java.math.BigDecimal;
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
    public BigDecimal totalPrice(List<? extends House> houses) {
        return houses.stream()
                .map(House::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
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
