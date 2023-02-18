package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private List<Car> cars;
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) int count,
                            ModelMap model) {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes-Benz", "C300", 250));
        cars.add(new Car("BMW", "M3", 350));
        cars.add(new Car("Volkswagen", "Polo", 120));
        cars.add(new Car("Huyndai", "Getz", 97));
        cars.add(new Car("KIA", "Ceed", 150));

        CarService carService = new CarServiceImp(cars);
        List<Car> numberOfCars = carService.getNumberOfCars(count);

        model.addAttribute("cars", numberOfCars);
        return "cars";
    }
}
