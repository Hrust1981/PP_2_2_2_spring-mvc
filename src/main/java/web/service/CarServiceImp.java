package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    private List<Car> cars;

    public CarServiceImp() {
    }

    public CarServiceImp(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getNumberOfCars(int numberOfCars) {
        List<Car> newListCars = new ArrayList<>();
        if (numberOfCars > cars.size()) {
            numberOfCars = cars.size();
        }
        for (int i = 0; i < numberOfCars; i++) {
            newListCars.add(cars.get(i));
        }
        return newListCars;
    }
}
