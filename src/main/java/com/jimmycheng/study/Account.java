package com.jimmycheng.study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Account {

    private String name;

    //private List<Stock> stocks = new ArrayList<Stock>();
    
    private Map<Stock, Integer> stocks = new HashMap<Stock, Integer>();
    /*
     * this method gets the market value for each stock, sums it up and returns
     * the total value of the account.
     */
    public Double getTotalValue() {
        
        Double value = 0.0;
        
        Set<Stock> key = stocks.keySet();
        
        for (Iterator it = key.iterator(); it.hasNext();) {
            Stock s = (Stock) it.next();
            value += (s.getPrice() * stocks.get(s));
        }
        return value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //update to <key, value>
    
    public Map<Stock, Integer> getStocks() {
        return stocks;
    }

    public void setStocks(Map<Stock, Integer> stocks) {
        this.stocks = stocks;
    }

    public void addStock(Stock stock, int value) {
        stocks.put(stock, value);
    }

}