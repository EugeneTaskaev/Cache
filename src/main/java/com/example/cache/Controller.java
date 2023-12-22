package com.example.cache;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final  CachService cachService;

    public Controller(CachService cachService) {
        this.cachService = cachService;
    }

    @GetMapping
public String getData() {
    return cachService.getData();
    }
}
