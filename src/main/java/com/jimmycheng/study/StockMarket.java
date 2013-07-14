package com.jimmycheng.study;

public class StockMarket {
	public Double getPrice(String stockName){
		System.out.println("User should not call this in unit testing!");
		return 1.0;
	}
	
	public String getMarketName(){
		return "NASDAQ";
	}
}