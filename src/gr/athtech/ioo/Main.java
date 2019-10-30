package gr.athtech.ioo;

public class Main {
    public static void main(String[] args) {
        Flight f1 = new Flight();
        f1.setDepAirport("athens");
        f1.setArAirport("california");
        System.out.println(f1.toString());
    }
}
