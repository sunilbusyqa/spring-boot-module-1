package com.busyqa.catalog;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Product {

    public double getPrice() {
        return 1.5;
    }
}
