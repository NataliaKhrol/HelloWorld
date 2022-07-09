public class GroundTransport extends Transport {

     int wheelsQuantity;
     int fuelConsumption;

    public GroundTransport(int horsePower, int maxSpeed, int weight, String brand, int wheelsQuantity, int fuelConsumption) {
        super(horsePower, maxSpeed, weight, brand);
        this.wheelsQuantity = wheelsQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public void printInfo() {
        super.printInfo();

    }
}
