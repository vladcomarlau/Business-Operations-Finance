package com.comarlau.backend.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MySecondClass {
    public String myMethod() {
        return "MySecondClass.myMethod";
    }
}
