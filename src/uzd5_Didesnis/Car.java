package uzd5_Didesnis;

import java.util.Set;

/**
 * Created by Askew on 3/1/2017.
 */
public class Car {
    private int year;
    private CarModel carModel;
    private Set<CarPart> carParts;

    public int getYear() {
        return year;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public Set<CarPart> getCarParts() {
        return carParts;
    }

    public Car(int year, CarModel carModel) {
        this.year = year;
        this.carModel = carModel;

    }

    public String toFileFormat() {
        return year + "," + carModel;
    }
}
