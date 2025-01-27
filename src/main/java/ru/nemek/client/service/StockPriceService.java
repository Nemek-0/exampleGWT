package ru.nemek.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ru.nemek.client.exceptoin.DelistedException;
import ru.nemek.client.model.StockPrice;

@RemoteServiceRelativePath("stockPrices")
public interface StockPriceService extends RemoteService {

    StockPrice[] getPrices(String[] symbols) throws DelistedException;
}
