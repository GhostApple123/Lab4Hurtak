package edu.psu.alex;

/**
 * Project: Lab 4
 * Purpose Details: Represents pizza delivery information.
 * Course: IST 242
 * Author: Alexander Matthew Hurtak
 * Date Developed: 06/16/2026
 * Last Date Changed: 06/16/2026
 * Rev: 1
 */
public class Delivery {

    private String deliveryType;
    private String deliveryTime;
    private Address address;

    public Delivery() {
    }

    public Delivery(String deliveryType, String deliveryTime, Address address) {
        this.deliveryType = deliveryType;
        this.deliveryTime = deliveryTime;
        this.address = address;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}