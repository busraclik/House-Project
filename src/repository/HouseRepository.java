package repository;

import model.Apartment;
import model.HolidayHome;
import model.House;
import model.Villa;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private final List<House> houseList = new ArrayList<>();

    public HouseRepository() {
        houseList.add(new Apartment(4,1,20,200,13));
        houseList.add(new Apartment(8,2,80,100,8));
        houseList.add(new Apartment(5,2,40,300,15));

        houseList.add(new Villa(12,2,15,40,true));
        houseList.add(new Villa(10,2,19,40,true));
        houseList.add(new Villa(15,3,1,20,true));

        houseList.add(new HolidayHome(7,1,9,3,true));
        houseList.add(new HolidayHome(5,2,5,1.25,false));
        houseList.add(new HolidayHome(7,1,2,1.75,false));

    }

    //bu kısım generic yazılabilir yazılsın mı? kalsın mı küçük bir projeyi karmaşık hale getirmemek adına?
    public List<House> getHouseList() {
        return houseList;
    }

    public List<Apartment> getApartmentList(){
        return houseList.stream()
                .filter(apartment -> apartment instanceof Apartment)
                .map(h -> (Apartment) h)
                .toList();

    }
    public List<Villa> getVillaList(){
        return houseList.stream()
                .filter(villa -> villa instanceof Villa)
                .map(v -> (Villa) v)
                .toList();

    }

    public List<HolidayHome> getHolidayHomeList(){
        return houseList.stream()
                .filter(holidayHome -> holidayHome instanceof HolidayHome)
                .map(hh -> (HolidayHome) hh)
                .toList();

    }

}
