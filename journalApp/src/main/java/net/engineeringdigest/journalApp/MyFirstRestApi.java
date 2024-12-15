package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestApi {

    @GetMapping("/api/welcome")
    public String getMessage() {
        return "Hello World!";
    }
}
