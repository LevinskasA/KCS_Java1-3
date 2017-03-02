package uzd5_Didesnis;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Askew on 3/1/2017.
 */
public class ClientInfo {
    //temp
    ClientInfo(){

    }
    //temp

    private Car car; //year, name, parts
    private List<Service> services;

    public Car getCar() {
        return car;
    }

    public List<Service> getServices() {
        return services;
    }


    ClientInfo(Car car) {
        this.car = car;
        services = new LinkedList<>();

    }


    public void addService (Service service){
        services.add(service);
    }

    public Service getService(int index) {
        return services.get(index);
    }


}
