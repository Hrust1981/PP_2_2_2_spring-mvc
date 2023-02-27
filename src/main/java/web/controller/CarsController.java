package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false
            , defaultValue = "2147483647") int count, ModelMap model) {

        model.addAttribute("cars", carService.getNumberOfCars(count));
        return "cars";
    }
}
