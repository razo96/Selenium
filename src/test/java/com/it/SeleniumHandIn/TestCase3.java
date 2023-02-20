package com.it.SeleniumHandIn;

import org.junit.jupiter.api.Test;

public class TestCase3  extends FillForm{
    /* As a user, I would like to be able to choose between Hotels,
    Flights, Tours, Cars and Visa so I can search
    for that I want information about.*/
    @Test
    public void TestElements() throws InterruptedException{
        ChooseFlightsTab();

        Thread.sleep(1000);
        ChooseTourTab();

        Thread.sleep(2000);
        ChooseTransferTab();

        Thread.sleep(3000);
        ChooseVisaTab();

        Thread.sleep(1000);
        ChooseHotelTab();

    }

}