package ru.netology.service;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainFor1Cashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainFor2Cashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

}