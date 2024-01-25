package com.example;

import org.openqa.selenium.WebDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverHandler.webDriverInitializer();
        Parser parser = new Parser(webDriver);
        parser.viewOffer();
        webDriver.quit();
    }
}
