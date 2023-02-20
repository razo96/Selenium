package com.it.SeleniumHandIn;

import org.junit.jupiter.api.Test;

public class TestCase9 extends FillForm{
    /*	As a traveller I want to be able to book multiple rooms and give the number of guests */
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
   /*   OpenCheckinCalender();
        InsertCheckinDate();
        Thread.sleep(1000);

        OpenCheckoutCalender();
        InsertCheckoutDate();
        Thread.sleep(1000);
*/
        ToggleTravellerDropDown();
        Thread.sleep(1000);
        AddOneRoom();
        Thread.sleep(1000);
        AddOneChildTraveller();
        Thread.sleep(1000);
        RemoveOneAdultTraveller();
        Thread.sleep(1000);
        RemoveOneChildTraveller();
        Thread.sleep(1000);
        AddOneAdultTraveller();
        Thread.sleep(1000);
        RemoveOneRoom();
        ToggleTravellerDropDown();
        Thread.sleep(1000);
        SubmitHotelSearch();

    }

}