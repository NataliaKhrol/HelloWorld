import java.util.Random;
import java.util.Scanner;

public class Car {

    private String brand;
    private int speed;
    private int cost;

    public Car(String brand, int speed, int cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }

     public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void startCar() throws MyExc {
        Random random = new Random();
        int j = random.nextInt(20);
        // Scanner scanner = new Scanner(System.in); (scanner это я сама для себя пробовала, чтоб проверить работу)
        // int j = scanner.nextInt();
        if (j % 2 == 0) {
            throw new MyExc("Something goes wrong with the car " + brand);
        } else {
            System.out.println("The car " + brand + " starts");

        }
    }
}




