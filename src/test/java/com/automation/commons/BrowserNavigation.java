package com.automation.commons;

import com.automation.utils.DriverUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BrowserNavigation extends CommonMethods {

    @Test
    public void learnBrowserNavigation() throws InterruptedException {
        WebDriver driver = getDriver();
        Thread.sleep(3000);

        //driver.navigate().to(url) assentially opens up a different url in the same driver session
        //it is the equivalent of using the search bar to go from the current website to a different one
        driver.navigate().to("http://18.116.88.132:8080/bank/login");
        Thread.sleep(3000);


        // driver.navigate().back();will bring you to the original url you were on before going into a new page/Link
        driver.navigate().back();
        Thread.sleep(3000);


         //driver.navigate().forward();does the opposite of the .back() method and will essentially undo the .back() method
        driver.navigate().forward();
        Thread.sleep(3000);

        // driver.navigate().refresh(); will refresh the current page
        driver.navigate().refresh();
        Thread.sleep(3000);

    }

    @Test
    public void practice1() throws InterruptedException {
        WebDriver driver = getDriver();
        loginToSauceDemo();
        Thread.sleep(3000);




    }
    @Before
    public void setUp(){
        createDriver("https://demoqa.com/upload-download");

    }
    @After
    public void cleanUp(){
        quitDriver();
    }

}

