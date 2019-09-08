package com.busyqa.catalog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Catalog {

    @Autowired(required = false)
    @Qualifier("book")
    private Product product = null;

    @PostConstruct
    public void displayPrice() {
        if (product != null) {
            System.out.println(product.getPrice());
        }
    }
}
