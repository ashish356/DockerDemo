package com.org.ashish.stepDefinitions;


import com.org.ashish.utils.Generic;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Hooks extends Generic {

    @Before
    public void setup()
    {

        //System.out.println("Before method of hooks executed");
        HashMap<String , Object> chromePreferences=new HashMap<>();
        chromePreferences.put("profile.default_content_settings.popups",0);
        ChromeOptions options=new ChromeOptions();
        options.addArguments("test-type");
        //options.addArguments("headless");
        options.setExperimentalOption("prefs",chromePreferences);
        options.addArguments("start-maximized");
        options.addArguments("--enable-automation");
        options.addArguments("test-type=browser");
        options.addArguments("-disable-infobars");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-Automation"));
        System.setProperty("webdriver.chrome.driver", findWebDriverLocation(System.getProperty("os.name").toLowerCase()));
        driver =new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
    private static String findWebDriverLocation(String os) {
        String baseDir=System.getProperty("user.dir");
        if(os.contains("mac"))
        {
            return baseDir+"/drivers/chromedriver";
        }else
        {
            return baseDir+"/drivers/chromedriver.exe";
        }


    }

    @After
    public void testDown()
    {
        driver.quit();
    }

}
