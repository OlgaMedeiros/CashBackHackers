package ru.netology;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void remain100() {

        CashBackHackService cashBack = new CashBackHackService();
        int amount = 100;

        int actual = cashBack.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void remain1() {

        CashBackHackService cashBack = new CashBackHackService();
        int amount = 1;

        int actual = cashBack.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void remain999() {

        CashBackHackService cashBack = new CashBackHackService();
        int amount = 999;

        int actual = cashBack.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void remain1010() {

        CashBackHackService cashBack = new CashBackHackService();
        int amount = 1010;

        int actual = cashBack.remain(amount);
        int expected = 990;

        Assert.assertEquals(actual, expected);

    }
    @Test
    public void remain1000() {

        CashBackHackService cashBack = new CashBackHackService();
        int amount = 1000;

        int actual = cashBack.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }
}


