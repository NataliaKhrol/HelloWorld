public class Transport {
     int horsePower;
     int maxSpeed;
     int weight;
     String brand;

    public Transport(int horsePower, int maxSpeed, int weight, String brand){
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;

    }
    public void printInfo(){
        System.out.println("Moschnost - " + horsePower);
        System.out.println("Maksimalnaya skorost - " + maxSpeed);
        System.out.println("Massa  - " + weight);
        System.out.println("Marka - " + brand);

    }


    }

