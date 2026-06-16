package edu.psu.alex;

import com.google.gson.Gson;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Project: Lab 4
 * Purpose Details: Sends a pizza order as JSON to the web service.
 * Course: IST 242
 * Author: Alexander Matthew Hurtak
 * Date Developed: 06/12/2026
 * Last Date Changed: 06/16/2026
 * Rev: 1
 */
public class WebServiceSend {

    public static void main(String[] args) {

        try {
            Customer customer =
                    new Customer("Alexander", "Hurtak", "555-123-4567");

            Address address =
                    new Address("123 College Ave", "State College", "PA", "16801");

            OrderItem orderItem =
                    new OrderItem("Pepperoni", "Large", 2, 25.99);

            Payment payment =
                    new Payment("Credit Card", 25.99, true);

            Delivery delivery =
                    new Delivery("Delivery", "30 minutes", address);

            PizzaOrder pizzaOrder =
                    new PizzaOrder(customer, orderItem, payment, delivery);

            Gson gson = new Gson();

            String json = gson.toJson(pizzaOrder);

            System.out.println("Sending Pizza Order JSON:");
            System.out.println(json);

            URL url =
                    new URL("http://localhost:8080/pizza");

            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            OutputStream outputStream =
                    connection.getOutputStream();

            outputStream.write(json.getBytes());
            outputStream.flush();
            outputStream.close();

            System.out.println("Response Code: "
                    + connection.getResponseCode());

            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}