package com.acme.mytrader.price;

import java.util.Map;
import java.util.HashMap;

public class PriceSourceImp implements PriceSource {
    Map<String, Double> stockPrice;
    {
        stockPrice  = new HashMap<String, Double>();
        stockPrice.put("IBM", 500.0);
        stockPrice.put("ABC", 200.0);
    }

    @Override
    public void addPriceListener(PriceListener listener) {
        System.out.println("Added price source");
    }

    @Override
    public void removePriceListener(PriceListener listener) {

    }

    @Override
    public Double getPrice(String companyName) {
        return stockPrice.get(companyName);
    }
}
