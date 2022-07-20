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
        System.out.println("���������� ���������� - " + passengerNumber);
        System.out.println("������-����� - " + isBusinessClass);
        System.out.println("�������� � �� - " + powerCalculation());
    }

    private double powerCalculation() {
        return horsePower * 0.74;

    }

    public void boarding() {
        System.out.println("������� ����� ���������� ������� ������������������ �� ���� ");
        Scanner scanner = new Scanner(System.in);
        currentPassengers = scanner.nextInt();
        if (currentPassengers <= passengerNumber) {
            System.out.println("������� �� ���� ��������� ");
        } else {
            System.out.println("�������, ����� �������������� ����");
        }
    }
}