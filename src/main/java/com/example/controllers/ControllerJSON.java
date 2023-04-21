package com.example.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerJSON {

    private static int idCounter = 1;

    @PostMapping("/json")
    public JsonData processJson(@RequestBody JsonData jsonData) {
        jsonData.getInfo().setId(idCounter++);
        return jsonData;
    }

    public static class JsonData {
        private double price;
        private InfoData info;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public InfoData getInfo() {
            return info;
        }

        public void setInfo(InfoData info) {
            this.info = info;
        }
    }

    public static class InfoData {
        private int id;
        private String date;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
}