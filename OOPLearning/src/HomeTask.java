import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {

        Computer asus = new Computer("IntelCore", 16, 500, 3);
        asus.printInfo();
        System.out.println("Please choose the command 1. ON / 2. OFF: ");

        Scanner scanner = new Scanner(System.in);
        int commandOn = 1;
        int commnandOff = 2;
        int choice = scanner.nextInt();


        if (choice == commandOn) {
            asus.switchOn();
        } else {
            asus.switchOff();

        }
    }
}




