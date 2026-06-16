package edu.psu.alex;

/**
 * Project: Lab 4
 * Purpose Details: Represents a customer delivery address.
 * Course: IST 242
 * Author: Alexander Matthew Hurtak
 * Date Developed: 06/15/2026
 * Last Date Changed: 06/15/2026
 * Rev: 1
 */
public class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address() {
    }

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}