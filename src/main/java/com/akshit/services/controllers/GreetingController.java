package com.akshit.services.controllers;

import io.tej.SwaggerCodgen.api.AliveApi;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController implements AliveApi {
    @Override
    public ResponseEntity<String> isAlive(String name) {
        return ResponseEntity.ok(
                name.equalsIgnoreCase("akshit")
                        ?"yes"
                        :"no");
    }
}
