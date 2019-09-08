package com.busyqa.catalog;

import org.springframework.stereotype.Component;

public class Book implements Product {

    public double getPrice() {
        return 4.5;
    }
}
