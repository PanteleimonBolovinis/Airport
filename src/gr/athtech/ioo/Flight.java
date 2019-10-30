package gr.athtech.ioo;

public class Flight {
    public String getArAirport() {
        return arAirport;
    }

    public String getDepAirport() {
        return depAirport;
    }

    private String arAirport;

    public void setArAirport(String arAirport) {
        this.arAirport = arAirport;
    }

    public void setDepAirport(String depAirport) {
        this.depAirport = depAirport;
    }

    private String depAirport;

    public String toString(){
        return "Flight- From: " + depAirport + ", To: " + arAirport;
    }

}
