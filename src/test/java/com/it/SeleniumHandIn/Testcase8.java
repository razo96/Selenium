package com.it.SeleniumHandIn;

import org.junit.jupiter.api.Test;

public class Testcase8 extends FillForm{
    /*	As a traveller I want to be able to book a hotelroom while providing a checkin and a checkout date */
    @Test
    public void TestElements() throws InterruptedException{
        ChooseFlightsTab();
        Thread.sleep(1000);
        ChooseHotelTab();
        CityTab();
        Thread.sleep(1000);
        TypeCity("Malmo");
        Thread.sleep(3000);
        PressEnter();
        Thread.sleep(1000);
        OpenCheckinCalender();
        InsertCheckinDate();
        Thread.sleep(1000);

        OpenCheckoutCalender();
        InsertCheckoutDate();
        Thread.sleep(1000);


        SubmitHotelSearch();

    }

}