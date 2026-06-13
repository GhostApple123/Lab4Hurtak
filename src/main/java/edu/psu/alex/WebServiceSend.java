package edu.psu.alex;

import com.google.gson.Gson;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Project: Lab 4
 * Purpose Details: Creates a PizzaOrder object, converts it into JSON,
 * and sends it to the pizza web service.
 * Course: IST 242
 * Author: Alexander Matthew Hurtak
 * Date Developed: 06/12/2026
 * Last Date Changed: 06/13/2026
 * Rev: 1
 */
public class WebServiceSend {

    public static void main(String[] args) {

        try {

            PizzaOrder pizza =
                    new PizzaOrder(
                            "Alexander Hurtak",
                            "Pepperoni",
                            2,
                            25.99);

            Gson gson = new Gson();

            String json = gson.toJson(pizza);

            System.out.println("Sending Pizza Order:");
            System.out.println(json);

            URL url =
                    new URL("http://localhost:8080/pizza");

            HttpURLConnection connection =
                    (HttpURLConnection)
                            url.openConnection();

            connection.setRequestMethod("POST");

            connection.setRequestProperty(
                    "Content-Type",
                    "application/json");

            connection.setDoOutput(true);

            OutputStream output =
                    connection.getOutputStream();

            output.write(json.getBytes());

            output.flush();
            output.close();

            System.out.println(
                    "Response Code: "
                            + connection.getResponseCode());

            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}