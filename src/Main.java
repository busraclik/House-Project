import model.House;
import repository.HouseRepository;
import service.HouseService;
import service.HouseServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome...");
        System.out.println("All House list");
        HouseService houseService = new HouseServiceImpl(new HouseRepository());
        print(houseService.getHouseList());
        System.out.println("----------------------------");
        System.out.println("All House Total Price: " + houseService.totalPrice(houseService.getHouseList()));
        System.out.println("All House Average Square Meters: " + houseService.averageTotalSquareMeter(houseService.getHouseList()));

        System.out.println("----------------------------");
        System.out.println("Apartment List");
        print(houseService.getApartmentList());
        System.out.println("----------------------------");
        System.out.println("All Apartment Total Price: " + houseService.totalPrice(houseService.getApartmentList()));
        System.out.println("All Apartments Average Square Meters: " + houseService.averageTotalSquareMeter(houseService.getApartmentList()));

        System.out.println("----------------------------");
        System.out.println("Villa List");
        print(houseService.getVillaList());
        System.out.println("----------------------------");
        System.out.println("All Villa Total Price: " + houseService.totalPrice(houseService.getVillaList()));
        System.out.println("All Villas Average Square Meters: " + houseService.averageTotalSquareMeter(houseService.getVillaList()));


        System.out.println("----------------------------");
        System.out.println("HolidayHome List");
        print(houseService.getHolidayHomeList());
        System.out.println("----------------------------");
        System.out.println("All Holiday Home Total Price: " + houseService.totalPrice(houseService.getHolidayHomeList()));
        System.out.println("All Holiday Home Average Square Meters: " + houseService.averageTotalSquareMeter(houseService.getHolidayHomeList()));

    }

    public static void print(List<? extends House> houses) {
        houses.stream().forEach(System.out::println);
    }
}