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
     *
     * @param city The {@link City} to add
     * @throws IllegalArgumentException The {@link City} is already in this list
     */
    public void add(City city) throws IllegalArgumentException {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns the list of {@link City}s, sorted by name
     *
     * @return The sorted list of {@link City}s
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Returns whether the given {@link City} is in this list
     *
     * @param city The city to find
     * @return true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes a city that has already been added to the list, if possible
     *
     * @param city The {@link City} to remove
     * @throws IllegalArgumentException The {@link City} isn't in this list
     */
    public void delete(City city) throws IllegalArgumentException {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the count of {@link City}s in this list
     *
     * @return The count of {@link City}s
     */
    public int countCities() {
        return cities.size();
    }
}
