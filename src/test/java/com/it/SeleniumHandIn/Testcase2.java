package com.it.SeleniumHandIn;

import org.junit.jupiter.api.Test;

public class Testcase2 extends FillForm{
    /*	As a traveller I want to be able to search tickets by
        providing departure, destionation and date */
    @Test
    public void TestElements() throws InterruptedException{
        ChooseFlightsTab();
        Thread.sleep(1000);
        OneWay();
        DepartureLocation("OSL - Gardermoen - Oslo");
        ArrivalLocation("CPH - Kastrup - Copenhagen");
        ClearDepartureDate();
        InsertDepartureDate("25-01-2023");
        Thread.sleep(1000);
        SearchFlights();
    }

}