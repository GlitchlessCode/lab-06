package com.example.listycity;

/**
 * A single city, characterized by a city name, and a province
 */
public class City implements Comparable<City> {
    /**
     * The city's name
     */
    private String city;
    /**
     * The name of the city's province
     */
    private String province;

    /**
     * Creates a new {@link City} with a specific name and province
     * @param city The name of the city
     * @param province The name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets this city's name
     * @return The city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets this city's province's name
     * @return The name of this city's province
     */
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City o) {
        return city.compareTo(o.getCityName());
    }
}
