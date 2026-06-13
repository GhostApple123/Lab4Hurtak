package edu.psu.alex;

/**
 * Project: Lab 4
 * Purpose Details: Represents a pizza order object.
 * Course: IST 242
 * Author: Alexander Matthew Hurtak
 * Date Developed: 06/11/2026
 * Last Date Changed: 06/13/2026
 * Rev: 1
 */
public class PizzaOrder {

    /**
     * Customer name for the pizza order.
     */
    private String customerName;

    /**
     * Type of pizza ordered.
     */
    private String pizzaType;

    /**
     * Number of pizzas ordered.
     */
    private int quantity;

    /**
     * Total price of the pizza order.
     */
    private double price;

    /**
     * Empty constructor needed for Gson.
     */
    public PizzaOrder() {
    }

    /**
     * Constructor for creating a pizza order.
     *
     * @param customerName Customer name.
     * @param pizzaType Type of pizza.
     * @param quantity Number of pizzas.
     * @param price Total price.
     */
    public PizzaOrder(String customerName, String pizzaType,
                      int quantity, double price) {
        this.customerName = customerName;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Gets the customer name.
     *
     * @return Customer name.
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the customer name.
     *
     * @param customerName Customer name.
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Gets the pizza type.
     *
     * @return Pizza type.
     */
    public String getPizzaType() {
        return pizzaType;
    }

    /**
     * Sets the pizza type.
     *
     * @param pizzaType Pizza type.
     */
    public void setPizzaType(String pizzaType) {
        this.pizzaType = pizzaType;
    }

    /**
     * Gets the quantity.
     *
     * @return Quantity ordered.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity.
     *
     * @param quantity Quantity ordered.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the price.
     *
     * @return Order price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price.
     *
     * @param price Order price.
     */
    public void setPrice(double price) {
        this.price = price;
    }
}