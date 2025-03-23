import main.java.formatter.CurrencyFormatter;
import main.java.model.House;
import main.java.repository.HouseRepository;
import main.java.service.HouseService;
import main.java.service.HouseServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome...");
        System.out.println("All House list");
        HouseService houseService = new HouseServiceImpl(new HouseRepository());
        print(houseService.getHouseList());
        System.out.println("----------------------------");
        System.out.println("All House Total Price: " + CurrencyFormatter.formatCurrency(houseService.totalPrice(houseService.getHouseList())));
        System.out.println("All House Average Square Meters: " + String.format("%.2f m²", houseService.averageTotalSquareMeter(houseService.getHouseList())));

        System.out.println("----------------------------");
        System.out.println("Apartment List");
        print(houseService.getApartmentList());
        System.out.println("----------------------------");
        System.out.println("All Apartment Total Price: " + CurrencyFormatter.formatCurrency(houseService.totalPrice(houseService.getApartmentList())));
        System.out.println("All Apartments Average Square Meters: " + String.format("%.2f m²", houseService.averageTotalSquareMeter(houseService.getApartmentList())));

        System.out.println("----------------------------");
        System.out.println("Villa List");
        print(houseService.getVillaList());
        System.out.println("----------------------------");
        System.out.println("All Villa Total Price: " + CurrencyFormatter.formatCurrency(houseService.totalPrice(houseService.getVillaList())));
        System.out.println("All Villas Average Square Meters: " + String.format("%.2f m²", houseService.averageTotalSquareMeter(houseService.getVillaList())));


        System.out.println("----------------------------");
        System.out.println("HolidayHome List");
        print(houseService.getHolidayHomeList());
        System.out.println("----------------------------");
        System.out.println("All Holiday Home Total Price: " + CurrencyFormatter.formatCurrency(houseService.totalPrice(houseService.getHolidayHomeList())));
        System.out.println("All Holiday Home Average Square Meters: " + String.format("%.2f m²", houseService.averageTotalSquareMeter(houseService.getHolidayHomeList())));

        System.out.println("----------------------------");
        System.out.println("Filtered list by room and living room");
        print(houseService.filterHousesByRoomAndLivingRoom(3, 2, houseService.getHouseList()));
    }

    public static void print(List<? extends House> houses) {
        if (houses.isEmpty())
            System.out.println("There is nothing to show...");
        houses.forEach(System.out::println);
    }
}