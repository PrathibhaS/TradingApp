package com.acme.mytrader.execution;

import com.acme.mytrader.execution.ExecutionService;

public class ExecutionServiceImpl implements ExecutionService {
  @Override
  public void buy(String security, double price, int volume) {
    System.out.println("Buying volume of " + volume + " stocks at " + price);
  }

  @Override
  public void sell(String security, double price, int volume) {
    System.out.println("Selling volume of " + volume + " stocks at " + price);
  }
}
