package com.WebS.controllers;

import com.WebS.controllers.DataJson.InfoData;
import com.WebS.controllers.DataJson.JsonData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerJSON {

    private static int idCounter = 1;

    @PostMapping("/json")
    public JsonData processJson(@RequestBody JsonData jsonData) {
        JsonData newData = new JsonData();
        newData.setPrice(jsonData.getPrice());

        InfoData infoData = new InfoData();
        infoData.setId(idCounter++);
        infoData.setDate(jsonData.getInfo().getDate());

        newData.setInfo(infoData);

        return newData;
    }




}