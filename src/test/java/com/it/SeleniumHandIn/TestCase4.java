package com.it.SeleniumHandIn;

import org.junit.jupiter.api.Test;

public class TestCase4 extends FillForm{
    /*	As a traveller I want to be able to select between different flight types */
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
        OpenFlightTypeDropdown();
        ChooseBusiness();
    /*  ChooseEconomy();
        ChooseEconomyPremium();
        ChooseFirst();*/
        Thread.sleep(1000);

        SearchFlights();
    }

}