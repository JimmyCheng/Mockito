package com.jimmycheng.study;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;

public class AccountMockito  {

    private Account account;

    @Before
    public void setUp() {
        account = new Account();
        account.setName("Jimmy's Account.");
    }

    @Test
    public void testGetTotalValue() {

        Stock stockMock = mock(Stock.class);
        when(stockMock.getPrice()).thenReturn(42.00);

        /* = Now start testing our account */
        account.addStock(stockMock, 2);

        assertEquals(new Double(84.00), account.getTotalValue());
    }

    @Test
    public void testAddMoreStock() {

        // very strange, why following 2 lines can not be put upward?
        Stock stockEbay = mock(Stock.class);
        when(stockEbay.getPrice()).thenReturn(42.00);
        
        Stock stockApple = mock(Stock.class);
        when(stockApple.getPrice()).thenReturn(300.00);

        /* = Now start testing our portfolio */
        account.addStock(stockEbay, 2);
        account.addStock(stockApple, 3);

        assertEquals(new Double(984.00), account.getTotalValue());
    }

}
