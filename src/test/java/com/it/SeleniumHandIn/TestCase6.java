package com.it.SeleniumHandIn;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 extends FillForm{
    /*	As a traveller I want to be able to remove different types of passengers */
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

        RemoveOneAdult();
        Thread.sleep(1000);
        RemoveOneChild();
        Thread.sleep(1000);
        RemoveOneInfant();
        Thread.sleep(1000);
        TogglePassengersDropDown();
        Thread.sleep(1000);
        SearchFlights();
    }

}
