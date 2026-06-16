package edu.psu.alex;

/**
 * Project: Lab 4
 * Purpose Details: Represents a full pizza order.
 * Course: IST 242
 * Author: Alexander Matthew Hurtak
 * Date Developed: 06/11/2026
 * Last Date Changed: 06/16/2026
 * Rev: 1
 */
public class PizzaOrder {

    private Customer customer;
    private OrderItem orderItem;
    private Payment payment;
    private Delivery delivery;

    public PizzaOrder() {
    }

    public PizzaOrder(Customer customer, OrderItem orderItem,
                      Payment payment, Delivery delivery) {
        this.customer = customer;
        this.orderItem = orderItem;
        this.payment = payment;
        this.delivery = delivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Delivery getDelivery() {
        return delivery;
    }

