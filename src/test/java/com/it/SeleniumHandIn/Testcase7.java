package com.it.SeleniumHandIn;

import org.junit.jupiter.api.Test;

public class Testcase7 extends FillForm{
    /*  As a user, I would like to book round trip flights with a departure date and a return date */

    @Test
    public void TestElements() throws InterruptedException{
        ChooseFlightsTab();
        Thread.sleep(1000);
        roundTrip();
        DepartureLocation("OSL - Gardermoen - Oslo");
        ArrivalLocation("CPH - Kastrup - Copenhagen");
        ClearDepartureDate();
        InsertDepartureDate("25-01-2023");
        ClearReturnDate();
        InsertReturnDate("24-02-2023");
        Thread.sleep(1000);
        SearchFlights();
    }

}