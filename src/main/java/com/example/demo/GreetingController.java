package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    // @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
    // If the name parameter is absent in the request, the defaultValue of World is used.
    public Greetings greetings(@RequestParam(value = "name", defaultValue = "World")String name){
        return new Greetings(counter.incrementAndGet(),
                String.format(template, name));

        // A key difference between a traditional MVC controller and the RESTful web service controller
        // is that the HTTP response body is created.
        // Rather than relying on a view technology to perform server-side rendering of the greeting data to HTML,
        // this RESTful web service controller populates and returns a Greeting object.
        // The object data will be written directly to the HTTP response as JSON.

    }
}
