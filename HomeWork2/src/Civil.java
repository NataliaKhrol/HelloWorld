import java.util.Scanner;

public class Civil extends AirTransport {
    int passengerNumber;
    boolean isBusinessClass;
    int currentPassengers;

    public Civil(int horsePower, int maxSpeed, int weight, String brand, int wingSpan, int minAirStripLength, int passengerNumber, boolean isBusinessClass) {
        super(horsePower, maxSpeed, weight, brand, wingSpan, minAirStripLength);
        this.passengerNumber = passengerNumber;
        this.isBusinessClass = isBusinessClass;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Количество пассажиров - " + passengerNumber);
        System.out.println("Бизнес-класс - " + isBusinessClass);
        System.out.println("Мощность в кВ - " + powerCalculation());
    }

    private double powerCalculation() {
        return horsePower * 0.74;

    }

    public void boarding() {
        System.out.println("Введите число пассажиров которые зарегестрировались на рейс ");
        Scanner scanner = new Scanner(System.in);
        currentPassengers = scanner.nextInt();
        if (currentPassengers <= passengerNumber) {
            System.out.println("Посадка на рейс завершена ");
        } else {
            System.out.println("Перебор, нужен дополнительный рейс");
        }
    }
}