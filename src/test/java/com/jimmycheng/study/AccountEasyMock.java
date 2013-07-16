package com.jimmycheng.study;

import static org.junit.Assert.*;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class AccountEasyMock {

    private Account account;

    @Before
    public void setUp() {
        account = new Account();
        account.setName("Jimmy's Account.");
    }

    @Test
    public void testGetTotalValue() {

        Stock stockMock = EasyMock.createMock(Stock.class);
        /* = Setup our mock object with the expected values */
        EasyMock.expect(stockMock.getPrice()).andReturn(42.00).times(1);
        
        EasyMock.replay(stockMock);

        /* = Now start testing our account */
        account.addStock(stockMock, 2);
        assertEquals(84.0, account.getTotalValue(), 0.001);
        EasyMock.verify();
    }

}
