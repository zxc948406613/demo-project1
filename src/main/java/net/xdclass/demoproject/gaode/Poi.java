package net.xdclass.demoproject.gaode;

import java.io.Serializable;

public class Poi implements Serializable {
    private String address;

    private String pname;

    private String name;

    private String location;

    private String cityname;

    private String adname;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    @Override
    public String toString() {
        return "Poi{" +
                "address='" + address + '\'' +
                ", pname='" + pname + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", cityname='" + cityname + '\'' +
                ", adname='" + adname + '\'' +
                '}';
    }
}
