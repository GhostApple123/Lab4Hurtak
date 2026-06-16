package edu.psu.alex;

import com.google.gson.Gson;

import static spark.Spark.*;

/**
 * Project: Lab 4
 * Purpose Details: Receives pizza order JSON and converts it back into objects.
 * Course: IST 242
 * Author: Alexander Matthew Hurtak
 * Date Developed: 06/12/2026
 * Last Date Changed: 06/16/2026
 * Rev: 1
 */
public class WebServiceReceive {

    public static void main(String[] args) {

        port(8080);

        System.out.println("Web Service Running on Port 8080");

        post("/pizza", (request, response) -> {

            Gson gson = new Gson();

            PizzaOrder pizzaOrder =
                    gson.fromJson(request.body(), PizzaOrder.class);

            System.out.println();
            System.out.println("Pizza Order Received");
            System.out.println("--------------------");

            System.out.println("Customer Name: "
                    + pizzaOrder.getCustomer().getFirstName()
                    + " "
                    + pizzaOrder.getCustomer().getLastName());

            System.out.println("Phone Number: "
                    + pizzaOrder.getCustomer().getPhoneNumber());

            System.out.println("Pizza Type: "
                    + pizzaOrder.getOrderItem().getPizzaType());

            System.out.println("Size: "
                    + pizzaOrder.getOrderItem().getSize());

            System.out.println("Quantity: "
                    + pizzaOrder.getOrderItem().getQuantity());

            System.out.println("Price: $"
                    + pizzaOrder.getOrderItem().getPrice());

            System.out.println("Payment Type: "
                    + pizzaOrder.getPayment().getPaymentType());

            System.out.println("Paid: "
                    + pizzaOrder.getPayment().isPaid());

            System.out.println("Delivery Type: "
                    + pizzaOrder.getDelivery().getDeliveryType());

            System.out.println("Delivery Time: "
                    + pizzaOrder.getDelivery().getDeliveryTime());

            System.out.println("Address: "
                    + pizzaOrder.getDelivery().getAddress().getStreet()
                    + ", "
                    + pizzaOrder.getDelivery().getAddress().getCity()
                    + ", "
                    + pizzaOrder.getDelivery().getAddress().getState()
                    + " "
                    + pizzaOrder.getDelivery().getAddress().getZipCode());

            response.type("text/plain");

            return "Pizza Order Received Successfully";
        });
    }
}