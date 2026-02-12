package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A list of {@link City}s
 */
public class CityList {
    /**
     * The internal list of cities
     */
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a new {@link City} to this list if it does not exist
     * @param city The {@link City} to add
     */
    public void add(City city) throws IllegalArgumentException {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns the list of {@link City}s, sorted by name
     * @return The sorted list of {@link City}s
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
