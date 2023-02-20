package com.it.SeleniumHandIn;

import org.junit.jupiter.api.Test;

public class TestCase1 extends FillForm{
    /*	As a traveller I want to be able to search tickets by
        providing departure and destionation locations */
    @Test
    public void TestElements() throws InterruptedException{
        ChooseFlightsTab();
        Thread.sleep(1000);
        OneWay();
        DepartureLocation("OSL - Gardermoen - Oslo");
        ArrivalLocation("CPH - Kastrup - Copenhagen");
        Thread.sleep(1000);
        SearchFlights();
    }

}