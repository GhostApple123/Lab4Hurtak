package edu.psu.alex;

import com.google.gson.Gson;

import static spark.Spark.*;

/**
 * Project: Lab 4
 * Purpose Details: Receives PizzaOrder objects as JSON data.
 * Course: IST 242
 * Author: Alexander Matthew Hurtak
 * Date Developed: 06/12/2026
 * Last Date Changed: 06/13/2026
 * Rev: 1
 */
public class WebServiceReceive {

    public static void main(String[] args) {

        port(8080);

        System.out.println("Web Service Running on Port 8080");

        post("/pizza", (request, response) -> {

            Gson gson = new Gson();

            String json = request.body();

            PizzaOrder pizza =
                    gson.fromJson(json, PizzaOrder.class);

            System.out.println();
            System.out.println("Pizza Order Received");
            System.out.println("--------------------");
            System.out.println("Customer Name: "
                    + pizza.getCustomerName());
            System.out.println("Pizza Type: "
                    + pizza.getPizzaType());
            System.out.println("Quantity: "
                    + pizza.getQuantity());
            System.out.println("Price: $"
                    + pizza.getPrice());

            response.type("text/plain");

            return "Pizza Order Received Successfully";
        });
    }
}