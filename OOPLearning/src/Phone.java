public class Phone {
    private int ram;
    private String cpu;
    private String brand;

    public Phone() {

    }

    public Phone(int ram, String cpu, String brand) {
        this.ram = ram;
        this.cpu = cpu;
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("Оперативная памть - " + ram);
        System.out.println("Процессор - " + cpu);
        System.out.println("Марка телефона - " + brand);
    }

    public void call(String phoneNumb) {

        System.out.println("Звоню с телефона - " + phoneNumb);
    }

    private void printHelloWorld() {

        System.out.println("Hello World");
    }

    public String getModel() {

        return brand;
    }

    public void setModel(String brand) {

        this.brand = brand;
    }

}
