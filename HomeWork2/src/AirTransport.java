public class AirTransport extends Transport {
     int wingSpan;
     int minAirStripLength;

       public AirTransport(int horsePower, int maxSpeed, int weight, String brand, int wingSpan, int minAirStripLength) {
        super(horsePower, maxSpeed, weight, brand);
        this.wingSpan = wingSpan;
        this.minAirStripLength = minAirStripLength;
      //  this.power = power;

    }


    public void printInfo(){
           super.printInfo();
}
}
