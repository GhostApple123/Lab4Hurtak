/**
 * Project: Lab 4
 * Purpose Details: Represents a pizza order object.
 * Course: IST 242
 * Author: Alexander Matthew Hurtak
 * Date Developed: 06/12/2026
 * Last Date Changed: 06/13/2026
 * Rev: 1
 */

package edu.psu.alex;

public class PizzaOrder {

    /**
     * Customer name.
     */
    private String customerName;

    /**
     * Pizza type ordered.
     */
    private String pizzaType;

    /**
     * Number of pizzas ordered.
     */
    private int quantity;

    /**
     * Price of order.
     */
    private double price;

    /**
     * Constructor.
     *
     * @param customerName customer name
     * @param pizzaType pizza type
     * @param quantity quantity ordered
     * @param price order price
     */
    public PizzaOrder(String customerName,
                      String pizzaType,
                      int quantity,
                      double price) {

        this.customerName = customerName;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Gets customer name.
     *
     * @return customer name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets customer name.
     *
     * @param customerName customer name
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Gets pizza type.
     *
     * @return pizza type
     */
    public String getPizzaType() {
        return pizzaType;
    }

    /**
     * Sets pizza type.
     *
     * @param pizzaType pizza type
     */
    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    /**
     * Gets quantity.
     *
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     *
     * @param quantity quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets price.
     *
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}