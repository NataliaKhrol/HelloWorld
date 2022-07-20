import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {

        Computer asus = new Computer("IntelCore", 16, 500, 2);
        asus.printInfo();


        while (true) {
            System.out.println("Please choose the command 1. ON  2. OFF  3. EXIT ");
            Scanner scanner = new Scanner(System.in);
            int commandOn = 1;
            int commnandOff = 2;
            int commandExit = 3;
            int choice = scanner.nextInt();


            if (choice == commandOn) {
                asus.switchOn();

            } else if (choice == commnandOff) {
                asus.switchOff();

            } else if (choice == commandExit) {
                return;

            }
        }
    }
}




