package edu.psu.alex;

/**
 * Project: Lab 4
 * Purpose Details: Represents payment information for a pizza order.
 * Course: IST 242
 * Author: Alexander Matthew Hurtak
 * Date Developed: 06/16/2026
 * Last Date Changed: 06/16/2026
 * Rev: 1
 */
public class Payment {

    private String paymentType;
    private double totalAmount;
    private boolean paid;

    public Payment() {
    }

    public Payment(String paymentType, double totalAmount, boolean paid) {
        this.paymentType = paymentType;
        this.totalAmount = totalAmount;
        this.paid = paid;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}