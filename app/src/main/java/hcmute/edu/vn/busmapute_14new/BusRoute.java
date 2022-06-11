package hcmute.edu.vn.busmapute_14new;

public class BusRoute {
    private int id;
    private String busRoute;

    public BusRoute(int id, String busRoute) {
        this.id = id;
        this.busRoute = busRoute;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusRoute() {
        return busRoute;
    }

    public void setBusRoute(String busRoute) {
        this.busRoute = busRoute;
    }
}
