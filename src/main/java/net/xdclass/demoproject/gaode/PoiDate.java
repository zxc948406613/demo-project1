package net.xdclass.demoproject.gaode;

import java.io.Serializable;
import java.util.List;

public class PoiDate implements Serializable {
    private List<Poi> pois;

    private String count;

    public List<Poi> getPois() {
        return pois;
    }

    public void setPois(List<Poi> pois) {
        this.pois = pois;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "PoiDate{" +
                "pois=" + pois +
                ", count='" + count + '\'' +
                '}';
    }
}
