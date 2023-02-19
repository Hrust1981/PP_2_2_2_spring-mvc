package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private List<Car> cars;

    @GetMapping(value = "/cars")
    public String printCars(HttpServletRequest servletRequest, ModelMap model) {
        cars = new ArrayList<>();
        cars.add(new Car("Mercedes-Benz", "C300", 250));
        cars.add(new Car("BMW", "M3", 350));
        cars.add(new Car("Volkswagen", "Polo", 120));
        cars.add(new Car("Huyndai", "Getz", 97));
        cars.add(new Car("KIA", "Ceed", 150));

        int param = servletRequest.getParameter("count") == null
                ? cars.size()
                : Integer.parseInt(servletRequest.getParameter("count"));
        CarService carService = new CarServiceImp(cars);
        List<Car> numberOfCars = carService.getNumberOfCars(param);
        model.addAttribute("cars", numberOfCars);
        return "cars";
    }
}
