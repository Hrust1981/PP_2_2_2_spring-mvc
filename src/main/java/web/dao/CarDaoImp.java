package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao{
    @Override
    public List<Car> getNumberOfCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Mercedes-Benz", "C300", 250));
        cars.add(new Car("BMW", "M3", 350));
        cars.add(new Car("Volkswagen", "Polo", 120));
        cars.add(new Car("Huyndai", "Getz", 97));
        cars.add(new Car("KIA", "Ceed", 150));
        return cars;
    }
}
