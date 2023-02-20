package com.it.SeleniumHandIn;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class FillForm extends BaseClass{

    //Flight Methods
    public void ChooseFlightsTab(){
        WebElement element = webDriver.findElement(By.id(flightTab));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        WebElement[] arguments;
        executor.executeScript( "arguments[0].click();", element); }

    public void OneWay(){
        webDriver.findElement(By.id(oneWay)).click();
    }
    public void roundTrip(){ webDriver.findElement(By.xpath(roundTrip)).click(); }
    public void DepartureLocation (String departureLocation){webDriver.findElement(By.id(departure)).sendKeys(departureLocation);}
    public void ArrivalLocation (String arrivalLocation){webDriver.findElement(By.id(arrival)).sendKeys(arrivalLocation); }
    public void ClearDepartureDate(){  webDriver.findElement(By.id(departureDate)).clear(); }
    public void InsertDepartureDate (String date){   webDriver.findElement(By.id(departureDate)).sendKeys(date);  }
    public void ClearReturnDate(){  webDriver.findElement(By.id(returnDate)).clear();  }
    public void InsertReturnDate (String date){  webDriver.findElement(By.id(returnDate)).sendKeys(date);  }
    public void TogglePassengersDropDown(){
        webDriver.findElement(By.cssSelector(passengerDropDown)).click();
    }
    public void AddOneAdult(){  webDriver.findElement(By.cssSelector(addAdult)).click();   }
    public void RemoveOneAdult(){   webDriver.findElement(By.cssSelector(removeAdult)).click();    }
    public void AddOneChild(){    webDriver.findElement(By.cssSelector(addChild)).click();    }
    public void RemoveOneChild(){    webDriver.findElement(By.cssSelector(removeChild)).click();   }
    public void AddOneInfant(){    webDriver.findElement(By.cssSelector(addInfant)).click();   }
    public void RemoveOneInfant(){   webDriver.findElement(By.cssSelector(removeInfant)).click();  }
    public void OpenFlightTypeDropdown(){  webDriver.findElement(By.cssSelector(flightType)).click();   }
    public void ChooseEconomy(){   webDriver.findElement(By.cssSelector(economy)).click();   }
    public void ChooseEconomyPremium(){ webDriver.findElement(By.cssSelector(economyPremium)).click();   }
    public void ChooseBusiness(){ webDriver.findElement(By.cssSelector(business)).click();   }
    public void ChooseFirst(){webDriver.findElement(By.cssSelector(first)).click();    }
    public void SearchFlights(){
        webDriver.findElement(By.id(searchButton)).click();
    }


    //Hotel Methods
    public void ChooseHotelTab(){
        WebElement element = webDriver.findElement(By.cssSelector(hotelTab));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        WebElement[] arguments;
        executor.executeScript( "arguments[0].click();", element);
    }
    public void CityTab (){
        webDriver.findElement(By.cssSelector(clickOnCityTab)).click();
    }
    public void TypeCity (String city){
        webDriver.findElement(By.cssSelector(typeInCity)).sendKeys(city , Keys.RETURN);
    }
    public void PressEnter (){
        webDriver.findElement(By.cssSelector(typeInCity)).sendKeys(Keys.RETURN);
    }



    public void OpenCheckinCalender(){
        webDriver.findElement(By.cssSelector(checkinDateCalender)).click();

    }
    public void InsertCheckinDate (){
        webDriver.findElement(By.xpath(checkinDate)).click();
    }

    public void OpenCheckoutCalender(){
        webDriver.findElement(By.cssSelector(checkoutDateCalender)).click();

    }
    public void InsertCheckoutDate (){
        webDriver.findElement(By.xpath(checkoutDate)).click(); }

    public void ToggleTravellerDropDown(){
        webDriver.findElement(By.cssSelector(travellersDropdown)).click();
    }

    public void AddOneRoom(){
        webDriver.findElement(By.cssSelector(addRoom)).click();

    }
    public void RemoveOneRoom(){
        webDriver.findElement(By.cssSelector(removeRoom)).click();

    }

    public void AddOneAdultTraveller(){
        webDriver.findElement(By.cssSelector(addAdultTraveller)).click();

    }
    public void RemoveOneAdultTraveller(){
        webDriver.findElement(By.cssSelector(removeAdultTraveller)).click();

    }

    public void AddOneChildTraveller(){
        webDriver.findElement(By.cssSelector(addChildTraveller)).click();

    }
    public void RemoveOneChildTraveller(){
        webDriver.findElement(By.cssSelector(removeChildTraveller)).click();
    }

    public void Nationality (String travellersNationality){
        webDriver.findElement(By.id(nationality)).sendKeys(travellersNationality);  }
    public void SubmitHotelSearch(){
        webDriver.findElement(By.id(hotelSearchSubmit)).click();
    }

    //Visa Methods
    public void ChooseVisaTab(){
        WebElement element = webDriver.findElement(By.id(visaTab));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        WebElement[] arguments;
        executor.executeScript( "arguments[0].click();", element);
    }
    public void ClickOnFromCountryTab(){
        webDriver.findElement(By.id(fromCountryTab)).click();
    }

    public void TypeFromCountry(String country1){
        webDriver.findElement(By.xpath(typeFromCountry)).sendKeys(country1, Keys.RETURN);
    }
    public void PressEnter2 (){
        webDriver.findElement(By.id(typeFromCountry)).sendKeys(Keys.RETURN);
    }
    public void ClickOnToCountryTab(){
        webDriver.findElement(By.xpath(toCountryTab)).click();
    }

    public void TypeToCountry(String country2){
        webDriver.findElement(By.xpath(typeToCountry)).sendKeys(country2, Keys.RETURN);
    }
    public void PressEnter3 (){
        webDriver.findElement(By.id(typeToCountry)).sendKeys(Keys.RETURN);
    }


    public void OpenVisaCalender(){
        webDriver.findElement(By.xpath(openVisaCalender)).click();

    }
    public void InsertVisaDate (){
        webDriver.findElement(By.xpath(selectDate)).click();
    }

    public void SubmitVisaForm(){
        webDriver.findElement(By.id(submitButton)).click();
    }


    //Other Methods
    public void ChooseTourTab(){
        WebElement element = webDriver.findElement(By.id(tourTab));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        WebElement[] arguments;
        executor.executeScript( "arguments[0].click();", element);
    }
    public void ChooseTransferTab(){
        WebElement element = webDriver.findElement(By.xpath(transferTab));
        JavascriptExecutor executor = (JavascriptExecutor) webDriver;
        WebElement[] arguments;
        executor.executeScript( "arguments[0].click();", element);
    }


}
