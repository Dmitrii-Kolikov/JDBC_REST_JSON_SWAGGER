package com.swagger.swagger.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "/health", tags = {"Проверка состояния сервиса"})
public class HealthController {

    @GetMapping("/health")
    @ApiOperation(value = "Получить сотсояние сервера",
            httpMethod = "GET",
            produces = "application/json",
            response = String.class
    )
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Внутрення ошибка")
    })
    public String getHealth() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("started", true);
        return jsonObject.toString();
    }
}
