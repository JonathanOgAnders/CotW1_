package com.company;

import java.awt.*;

public class CountryCity extends Point
{
    private String city;
    private String country;

    private boolean isNorth;
    private boolean isEast;

    //længdegrad (lodrette streger)
    private Point longitude;

    //breddergrader (vandrette streger)
    private Point latitude;

    public CountryCity(String city, String counrty, int latitude1, int latitude2, boolean isNorth, int longitude1,
                       int longitude2, boolean isEast)
    {
        this.city = city;
        this.country = counrty;
        this.latitude = new Point(latitude1, latitude2);
        this.isNorth = isNorth;
        this.longitude = new Point(longitude1, longitude2);
        this.isEast = isEast;
    }

    public String toString()
    {
        return country + ", " + city;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }

    public boolean isNorth()
    {
        return isNorth;
    }

    public boolean isEast()
    {
        return isEast;
    }

    public Point getLongitude()
    {
        return longitude;
    }

    public Point getLatitude()
    {
        return latitude;
    }
}
