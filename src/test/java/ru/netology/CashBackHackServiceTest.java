package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;


class CashBackHackServiceTest {

    @Test
    void remain600() {    //метод

        CashBackHackService cashBack = new CashBackHackService();
        int amount = 600;

        int actual = cashBack.remain(amount);
        int expected = 400;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void remain999() {    //метод

        CashBackHackService cashBack = new CashBackHackService();
        int amount = 999;

        int actual = cashBack.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void remain1000() {    //метод

        CashBackHackService cashBack = new CashBackHackService();
        int amount = 1000;

        int actual = cashBack.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}