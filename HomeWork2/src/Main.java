public class Main {
    public static void main(String[] args) {
        //test data
        final double timeHrs = 2.6;

        System.out.println("Legkovoy: ");
        PassengerTransport passengerTransport = new PassengerTransport(113, 175, 1165, "clio estate sport", 4, 9, "Universal", 5);
        passengerTransport.printInfo();
        passengerTransport.printCount(timeHrs);

        System.out.println("-------------------");
        System.out.println("Gruzovoi: ");
        FreightTransport freightTransport = new FreightTransport(360, 120, 18000, "Scania P360", 12, 30, 34000);
        freightTransport.printInfo();
        freightTransport.powerCalculation();
        freightTransport.truck();

        System.out.println("---------------");
        System.out.println("Vozdushniy voenniy: ");
        Military military = new Military(17000, 777, 61000, "AN12", 38, 1200, false, 12);
        military.printInfo();
        military.powerCalculation();
        military.shoot();
        military.catapulta();

        System.out.println("--------------------------");
        System.out.println("Grazhdanskiy: ");
        Civil civil = new Civil(175000, 920, 68, "Lufthansa Boeing 747-400", 65, 4000, 304, true);
        civil.printInfo();
        civil.boarding();
    }
}
