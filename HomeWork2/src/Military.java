import java.util.Scanner;

public class Military extends AirTransport {
    boolean isEjectionSystemEquipped;
    int missilesNumber;
    int missileLeft;

    public Military(int horsePower, int maxSpeed, int weight, String brand, int wingSpan, int minAirStripLength, boolean isEjectionSystemEquipped, int missilesNumber) {
        super(horsePower, maxSpeed, weight, brand, wingSpan, minAirStripLength);
        this.isEjectionSystemEquipped = isEjectionSystemEquipped;
        this.missilesNumber = missilesNumber;
    }

    @Override
    public void printInfo() {

        super.printInfo();
        System.out.println("Kolichestvo raket na bortu - " + missilesNumber);
        System.out.println("Katapultirovanie - " + isEjectionSystemEquipped);
    }

    public void powerCalculation() {
        double power;
        power = horsePower * 0.74;
        System.out.println("Мощность в кВ - " + power);
    }

    public void shoot() {
        System.out.println("Уточните, сколько ракет осталось ");
        Scanner scanner = new Scanner(System.in);
        missileLeft = scanner.nextInt();
        if (missileLeft > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }

    }
    public void catapulta(){
        if (isEjectionSystemEquipped){
            System.out.println("Катапультирование прошло успешно");
        }else {
            System.out.println("У вас нет такой системы");
        }

    }
}