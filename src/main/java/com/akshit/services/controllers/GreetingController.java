package com.akshit.services.controllers;

import io.tej.SwaggerCodgen.api.HelloApi;
import io.tej.SwaggerCodgen.model.Greeter;
import io.tej.SwaggerCodgen.model.Greetings;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;


@RestController
public class GreetingController implements HelloApi {
    @Override
    public ResponseEntity<String> isAlive(String name) {
        return ResponseEntity.ok(
                name.equalsIgnoreCase("akshit")
                        ? "yes"
                        : "no");
    }

    @Override
    public ResponseEntity<Greetings> receiveGreetings(Greeter greeter) {
        return ResponseEntity.ok(
                Greetings.builder()
                        .reply(MessageFormat.format(
                                "Yo {0}, how you doing?",
                                greeter.getName()
                        )).build());
    }
}
