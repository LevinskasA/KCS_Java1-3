package uzd5_Didesnis;

/**
 * Created by Askew on 3/1/2017.
 */
public class Service {
    private float partPrice;
    private float repairPrice;

    public float getPartPrice() {
        return partPrice;
    }

    public float getRepairPrice() {
        return repairPrice;
    }

    public Service(CarPart carPart, float repairPrice){
        partPrice = carPart.getPrice();
        this.repairPrice = repairPrice;
    }

    public Service(float partPrice, float repairPrice){
        this.partPrice = partPrice;
        this.repairPrice = repairPrice;
    }


}
