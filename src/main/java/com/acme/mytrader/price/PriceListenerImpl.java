package com.acme.mytrader.price;

import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceSource;
import com.acme.mytrader.execution.ExecutionService;
import com.acme.mytrader.execution.ExecutionServiceImpl;

public class PriceListenerImpl implements PriceListener {

  private static String companyName = "IBM";
  private static PriceSource priceSource = new PriceSourceImp();
  private static ExecutionService execService = new ExecutionServiceImpl();

  @Override
  public void priceUpdate(String security, double price) {
    priceSource.addPriceListener(this);
    Double stockPrice = priceSource.getPrice(companyName);
    if(stockPrice<price)
      execService.buy(security, stockPrice, 100);
    else
      System.out.println("Not Buying stock as price is higher");
  }
}