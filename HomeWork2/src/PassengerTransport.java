public class PassengerTransport extends GroundTransport {
    private String vehicleBody;
    private int passengerNumbers;


    public PassengerTransport(int horsePower, int maxSpeed, int weight, String brand, int wheelsQuantity, int fuelConsumption, String vehicleBody, int passengerNumbers) {
        super(horsePower, maxSpeed, weight, brand, wheelsQuantity, fuelConsumption);
        this.vehicleBody = vehicleBody;
        this.passengerNumbers = passengerNumbers;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Kuzov - " + vehicleBody);
        System.out.println("���������� ���������� - " + passengerNumbers);
        System.out.println("�������� � �� - " + powerCalculation());
    }

    private double powerCalculation() {
        return horsePower * 0.74;
    }

    public double calcDistance(double timeHours) {

        return (timeHours * maxSpeed) / 1;

    }

    private double calcFuelCons(double timeHs) {
        double result = (calcDistance(timeHs) * fuelConsumption) / 100;
        return result;
    }

    public void printCount(double timeHours) {
        System.out.println("�� �����, ������ " + timeHours + " ����, ���������� " + brand + " �������� � ������������ ��������� " + maxSpeed
                + " ��/� ������� " + calcDistance(timeHours) + " �� � ����������� " + calcFuelCons(timeHours) + " ����� �� - 95. ");
    }
}
