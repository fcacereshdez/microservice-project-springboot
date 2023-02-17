package com.fcacereshdez.productmicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RestController
@RequestMapping("api/categories")
@Getter
@Setter
@RefreshScope
public class CategoryController {
    @Value("${app.testProp}")
    private String testProp;

    @GetMapping("test-prop")
    public String getTestPropo(){
        return this.testProp;
    }
}
