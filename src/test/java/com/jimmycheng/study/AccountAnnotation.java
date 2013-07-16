package com.jimmycheng.study;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.*;

@RunWith(MockitoJUnitRunner.class)
public class AccountAnnotation {

    @Mock
    private Stock stock;

    @InjectMocks
    private Account account = new Account();

    @Before
    public void setUp() {
        account.setName("Jimmy's Account.");
    }

    @Test
    public void testGetTotalValue() {

        when(stock.getPrice()).thenReturn(42.00);

        /* = Now start testing our portfolio */
        account.addStock(stock, 2);

        assertThat(account.getTotalValue(), is(84.00));

    }
}
