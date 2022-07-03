import java.util.Random;
import java.util.Scanner;

public class Computer {
    String cpu;
    int ram;
    int hdd;
    int onOffLimit;
    boolean isPowered;
    boolean isBroken = false;
    int onOffCounter;

    public Computer(String cpu, int ram, int hdd, int onOffLimit) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.onOffLimit = onOffLimit;
    }

    public void printInfo() {
        if (isBroken) {
            System.out.println("The comp is broken");
        } else {
            System.out.println("Процессор - " + cpu);
            System.out.println("Оперативная память - " + ram);
            System.out.println("Жесткий диск - " + hdd);
            System.out.println("Ресурс полных циклов - " + onOffCounter);
        }
    }

    public void switchOn() {
        if (isBroken) {
            System.err.println("The comp is broken and can't be switched on");
            return;
        }

        if (onOffCounter >= onOffLimit) {
            isBroken = true;
            System.err.println("Over the limit, the comp is fried");
            return;
        }

        if (isPowered) {
            System.out.println("The comp is already on");
            return;
        }

        Random random = new Random();
        int correctAnswer = random.nextInt(0, 2);

        System.out.print("Enter 0 or 1 to switch the computer on: ");

        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();
        if (userAnswer == correctAnswer) {
            isPowered = true;
            System.out.println("Computer is on");

        } else {
            isBroken = true;
            System.out.println("The comp is fried");
        }
    }

    public void switchOff() {
        Random random = new Random();
        int correctAnswer = random.nextInt(0, 2);
        System.out.println("Enter 0 or 1 to switch the computer off: ");

        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();
        if (userAnswer == correctAnswer) {
            System.out.println("Computer is off");
            onOffCounter++;
        } else {
            isBroken = true;
            System.out.println("The comp is fried");
        }
    }

}
