package com.jimmycheng.study;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class PortfolioMockito extends TestCase {
	
	private Portfolio portfolio;
	private StockMarket marketMock;

	@Before
	public void setUp() {
		portfolio = new Portfolio();
		portfolio.setName("Veera's portfolio.");

	}
	
	@Test
	public void testGetTotalValue() {

        //very strange, why following 2 lines can not be put upward?
		StockMarket marketMock = mock(StockMarket.class);
		portfolio.setStockMarket(marketMock);
		
		when(marketMock.getPrice("EBAY")).thenReturn(42.00);
		
		/* = Now start testing our portfolio */
		Stock ebayStock = new Stock("EBAY", 2);
		portfolio.addStock(ebayStock);		
		
		assertEquals(84.00, portfolio.getTotalValue());
	}
		
}
