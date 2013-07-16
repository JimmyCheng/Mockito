package com.jimmycheng.study;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.*;

public class AccountHamcrest {
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

        assertThat(account.getTotalValue(), is(84.00));

    }
}
