package main.java.repository;

import main.java.model.Apartment;
import main.java.model.HolidayHome;
import main.java.model.House;
import main.java.model.Villa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    //Mock data is created in this class.
    private final List<House> houseList = new ArrayList<>();

    public HouseRepository() {
        houseList.add(new Apartment(3, 1, BigDecimal.valueOf(2625000), 145, 13));
        houseList.add(new Apartment(4, 2, BigDecimal.valueOf(6625000), 100, 8));
        houseList.add(new Apartment(1, 1, BigDecimal.valueOf(2950000), 83, 15));

        houseList.add(new Villa(4, 2, BigDecimal.valueOf(11500000), 287, true));
        houseList.add(new Villa(5, 2, BigDecimal.valueOf(29000000), 359, false));
        houseList.add(new Villa(5, 1, BigDecimal.valueOf(15000000), 310, true));

        houseList.add(new HolidayHome(3, 1, BigDecimal.valueOf(3550000), 200, true));
        houseList.add(new HolidayHome(3, 1, BigDecimal.valueOf(9500000), 120, false));
        houseList.add(new HolidayHome(5, 1, BigDecimal.valueOf(7699999), 125, false));

    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<Apartment> getApartmentList() {
        return houseList.stream()
                .filter(apartment -> apartment instanceof Apartment)
                .map(h -> (Apartment) h)
                .toList();

    }

    public List<Villa> getVillaList() {
        return houseList.stream()
                .filter(villa -> villa instanceof Villa)
                .map(v -> (Villa) v)
                .toList();

    }

    public List<HolidayHome> getHolidayHomeList() {
        return houseList.stream()
                .filter(holidayHome -> holidayHome instanceof HolidayHome)
                .map(hh -> (HolidayHome) hh)
                .toList();

    }

}
