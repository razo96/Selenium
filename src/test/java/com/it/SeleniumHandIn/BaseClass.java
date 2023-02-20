package com.it.SeleniumHandIn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
    static WebDriver webDriver;

    //Flights tab
    public static String flightTab = "flights-tab";
    public static String oneWay = "one-way";
    public static String roundTrip = "//*[@id=\"round-trip\"]";
    public static String departure = "autocomplete";
    public static String arrival = "autocomplete2";
    public static String departureDate = "departure";
    public static String returnDate = "return";
    public static String passengerDropDown = "#onereturn > div.col-lg-2 > div > div > div > a";
    public static String addAdult = ".adult_qty > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > i:nth-child(1)";
    public static String removeAdult = ".adult_qty > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > i:nth-child(1)";
    public static String addChild = ".child_qty > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > i:nth-child(1)";
    public static String removeChild = ".child_qty > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > i:nth-child(1)";
    public static String addInfant = ".infant_qty > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > i:nth-child(1)";
    public static String removeInfant = ".infant_qty > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > i:nth-child(1)";
    public static String flightType = "#flight_type";
    public static String economy = "#flight_type > option:nth-child(1)";
    public static String economyPremium = "#flight_type > option:nth-child(2)";
    public static String business = "#flight_type > option:nth-child(3)";
    public static String first = "#flight_type > option:nth-child(4)";
    public static String searchButton = "flights-search";


    //Hotel Tab
    public static String hotelTab = "#hotels-tab";
    public static String clickOnCityTab ="#select2-hotels_city-container";
    public static String typeInCity =".select2-search__field";
    public static String checkinDateCalender = "#checkin";
    public static String checkinDate  ="/html/body/div[8]/div[1]/table/tbody/tr[3]/td[3]";
    public static String checkoutDateCalender ="#checkout";
    public static String checkoutDate ="/html/body/div[9]/div[1]/table/tbody/tr[3]/td[5]";

    public static String travellersDropdown ="#hotels-search > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > a:nth-child(1) > p:nth-child(1)";
    public static String addRoom =".roomInc > i:nth-child(1)";
    public static String removeRoom =".roomDec > i:nth-child(1)";
    public static String addAdultTraveller ="#hotels-search > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > i:nth-child(1)";
    public static String removeAdultTraveller ="#hotels-search > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > i:nth-child(1)";
    public static String addChildTraveller =".child_ages > div:nth-child(3) > i:nth-child(1)";
    public static String removeChildTraveller =".child_ages > div:nth-child(1) > i:nth-child(1)";
    public static String nationality ="nationality";
    public static String hotelSearchSubmit ="submit";

    //Visa Tab
    public static String visaTab = "visa-tab";
    public static String fromCountryTab ="select2-from_country-container";
    public static String typeFromCountry ="/html/body/span/span/span[1]/input";
    public static String toCountryTab ="//*[@id=\"select2-to_country-container\"]";
    public static String typeToCountry ="/html/body/span/span/span[1]/input";
    public static String openVisaCalender ="//*[@id=\"date\"]";
    public static String selectDate ="/html/body/div[16]/div[1]/table/tbody/tr[3]/td[5]";
    public static String submitButton ="submit";

    //Other Tabs
    public static String tourTab = "tours-tab";
    public static String transferTab = "//*[@id=\"cars-tab\"]";

    @BeforeAll
    public static void setUp() {
        webDriver = new FirefoxDriver();

        webDriver.get("https://phptravels.net/");
        webDriver.manage().window().maximize();

    }

   /* @AfterAll
    public static void tearDown(){
        webDriver.quit();
        */
    */
    }
}
