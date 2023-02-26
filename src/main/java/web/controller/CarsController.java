package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarsController {

    private CarService carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false
            , defaultValue = "2147483647") int count, ModelMap model) {

        carService = new CarServiceImp(count);
        model.addAttribute("cars", carService.getNumberOfCars());
        return "cars";
    }
}
