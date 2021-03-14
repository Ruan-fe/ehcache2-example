package com.ehcacheexample;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("olamundo")
public class OlaMundoEndpoint {

    @GetMapping
    @Cacheable(value = "getOlaMundo")
    public String getOlaMundo(){
        System.out.println("Entrou aqui");
        return "Olá mundo";
    }

}
