package ru.netology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldServiceWork() {
        CashbackHackService service = new CashbackHackService();

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldServiceRemindIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldServiceRemindIfAmountBoundaryValues() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldServiceRemindIfAmountBoundaryValue() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);

    }

}