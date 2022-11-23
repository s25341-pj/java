package pl.pjatk.Wypozyczalnia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WypozyczalniaApplication {

    private final CarService carService;

    public WypozyczalniaApplication(CarService carService) {
        this.carService = carService;
        this.carService.ShowAvailableCarList();
        this.carService.rentCar(new User("3"), "BBBBBBXCR18273982");
        this.carService.ShowAllRental();
    }

    public static void main(String[] args) {
        SpringApplication.run(WypozyczalniaApplication.class, args);
    }
}