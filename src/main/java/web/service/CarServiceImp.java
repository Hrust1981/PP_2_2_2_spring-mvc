package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarDao carsDao;

    @Override
    public List<Car> getNumberOfCars(int numberOfCars) {

        return carsDao.getNumberOfCars().stream()
                .limit(numberOfCars)
                .collect(Collectors.toList());
    }
}
