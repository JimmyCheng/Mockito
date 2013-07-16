package com.jimmycheng.study;

import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

public class AccountEasyMock extends TestCase {

    private Account account;

    @Before
    public void setUp() {
        account = new Account();
        account.setName("Veera's portfolio.");
    }

    @Test
    public void testGetTotalValue() {

        Stock stockMock = EasyMock.createMock(Stock.class);
        /* = Setup our mock object with the expected values */
        EasyMock.expect(stockMock.getPrice()).andReturn(42.00).times(1);
        EasyMock.replay(stockMock);

        /* = Now start testing our Account */

        account.addStock(stockMock, 2);
        assertEquals(84.00, account.getTotalValue());

        EasyMock.verify();
    }

}
