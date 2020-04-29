package com.acme.mytrader.strategy;

import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceListenerImpl;
/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy {

  private static PriceListener priceListener = new PriceListenerImpl();

  public static void main(String[] arg) {
    priceListener.priceUpdate("user1", 550);
  }
}
