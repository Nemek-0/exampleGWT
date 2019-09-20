package ru.nemek.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ru.nemek.client.model.StockPrice;

public interface StockPriceServiceAsync {
    void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);
}
