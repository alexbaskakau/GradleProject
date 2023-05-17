package ru.netology.service;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldSuggestToBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = service.remain(amount);
        int actual = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldSuggestToBuyMoreIfOverThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1350;
        int expected = service.remain(amount);
        int actual = 650;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotSuggestToBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = service.remain(amount);
        int actual = 0;
        assertEquals(actual, expected);
    }

}