package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.WebPage;

public class WebTableTest extends BaseClass {
    WebPage webPage;

    @BeforeTest
    public void init(){
        setup();
        webPage = new WebPage(driver);

    }

    @Test
    public void dataExtractionFromTable_ReturnOkStatus(){
        webPage.handleTable();
        System.out.println("success");
    }

    @AfterTest
    public void close(){
        driver.close();
    }
}
