package com.example.pojo;
import java.io.Serializable;
import java.util.Date;

public class HbFlight implements Serializable {
    private int id;
    private String flight_name;
    private String departure_city;
    private String arrival_city;
    private Date departure_time;
    private Date arrival_time;
    private int route_type;
    private int berth_type;
    private Double flight_price;
    private int flight_status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlight_name() {
        return flight_name;
    }

    public void setFlight_name(String flight_name) {
        this.flight_name = flight_name;
    }

    public String getDeparture_city() {
        return departure_city;
    }

    public void setDeparture_city(String departure_city) {
        this.departure_city = departure_city;
    }

    public String getArrival_city() {
        return arrival_city;
    }

    public void setArrival_city(String arrival_city) {
        this.arrival_city = arrival_city;
    }

    public Date getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Date departure_time) {
        this.departure_time = departure_time;
    }

    public Date getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(Date arrival_time) {
        this.arrival_time = arrival_time;
    }

    public int getRoute_type() {
        return route_type;
    }

    public void setRoute_type(int route_type) {
        this.route_type = route_type;
    }

    public int getBerth_type() {
        return berth_type;
    }

    public void setBerth_type(int berth_type) {
        this.berth_type = berth_type;
    }

    public Double getFlight_price() {
        return flight_price;
    }

    public void setFlight_price(Double flight_price) {
        this.flight_price = flight_price;
    }

    public int getFlight_status() {
        return flight_status;
    }

    public void setFlight_status(int flight_status) {
        this.flight_status = flight_status;
    }
}
