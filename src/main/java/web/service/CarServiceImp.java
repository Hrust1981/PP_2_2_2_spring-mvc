package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    private List<Car> cars;
    private int numberOfCars;

    private CarDao carsDao = new CarDaoImp();
    public CarServiceImp(int numberOfCars) {
        cars = carsDao.getNumberOfCars();
        this.numberOfCars = numberOfCars;
    }

    @Override
    public List<Car> getNumberOfCars() {

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
