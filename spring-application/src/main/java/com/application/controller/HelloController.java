package com.application.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static java.util.Objects.nonNull;

@RestController
public class HelloController {

    @GetMapping(value = {"/", "/{name}"})
    public String hello(@PathVariable(required = false) String name) {
        return nonNull(name) ? "Hello " + StringUtils.capitalize(name) : "Hello World!";
    }
}
