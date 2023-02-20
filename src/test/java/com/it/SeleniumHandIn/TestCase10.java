package com.it.SeleniumHandIn;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestCase10 extends FillForm{
    /*	As a traveller I want to be able apply for a visa */
    @Test
    public void TestElements() throws InterruptedException{
        ChooseFlightsTab();
        Thread.sleep(1000);

        ChooseVisaTab();
        Thread.sleep(1000);

        ClickOnFromCountryTab();
        TypeFromCountry("Sweden");
        Thread.sleep(2000);
       // PressEnter2();

        ClickOnToCountryTab();
        TypeToCountry("Australia");
        Thread.sleep(1000);

        OpenVisaCalender();
        InsertVisaDate();
        SubmitVisaForm();
    }

}
