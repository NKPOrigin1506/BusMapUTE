package hcmute.edu.vn.busmapute_14new;

public class BusStop {
    private int id;
    private String busStop;

    public BusStop(int id, String busStop) {
        this.id = id;
        this.busStop = busStop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusStop() {
        return busStop;
    }

    public void setBusStop(String busStop) {
        this.busStop = busStop;
    }
}
