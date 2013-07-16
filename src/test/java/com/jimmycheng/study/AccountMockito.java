package com.jimmycheng.study;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class AccountMockito extends TestCase {

    private Account account;

    @Before
    public void setUp() {
        account = new Account();
        account.setName("Veera's portfolio.");
    }

    @Test
    public void testGetTotalValue() {

        // very strange, why following 2 lines can not be put upward?
        Stock stockMock = mock(Stock.class);
        when(stockMock.getPrice()).thenReturn(42.00);

        /* = Now start testing our portfolio */
        account.addStock(stockMock, 2);

        assertEquals(84.00, account.getTotalValue());
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

        assertEquals(984.00, account.getTotalValue());
    }

}
