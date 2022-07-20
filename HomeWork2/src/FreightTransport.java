import java.util.Scanner;

public class FreightTransport extends GroundTransport {
    int capacity;
    int cargo;


    public FreightTransport(int horsePower, int maxSpeed, int weight, String brand, int wheelsQuantity, int fuelConsumption, int capacity) {
        super(horsePower, maxSpeed, weight, brand, wheelsQuantity, fuelConsumption);
        this.capacity = capacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Грузоподъемность - " + capacity);

    }
    //2-й вариант отличный от Гражд и Пассаж
    public void powerCalculation() {
        double power;
        power = horsePower * 0.74;
        System.out.println("Мощность в кВ - " + power);
    }
    public void truck(){
        System.out.println("Введите вес груза ");
        Scanner scanner = new Scanner(System.in);
        cargo = scanner.nextInt();
        if (cargo <= capacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");

        }
    }
}
