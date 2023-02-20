package com.it.SeleniumHandIn;

import org.junit.jupiter.api.Test;

public class TestCase5 extends FillForm{
    /*	As a traveller I want to be able to add different types of passengers */
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
        TogglePassengersDropDown();
        Thread.sleep(1000);
        AddOneAdult();
        Thread.sleep(1000);
        AddOneChild();
        Thread.sleep(1000);
        AddOneInfant();
        Thread.sleep(1000);
        TogglePassengersDropDown();
        Thread.sleep(1000);
        SearchFlights();
    }

}