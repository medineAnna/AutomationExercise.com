package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Class01 {


    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android"); //Welche Platform ISO oder Android
        //desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel5"); //es ist IOS wichtig
        //desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13.0"); //welche Applicatio mochte ich testen, schreibe ich hier die Version der App
        //wenn App Version 10, 10,8 ise 8
        //desiredCapabilities.setCapability(MobileCapabilityType.APPLICATION_NAME,"UiAutomator2");
        //Wir müssen UIAutomator2 für Android schreiben, es nimmt es und leitet diese Anfrage im JSON-Format an den Appium-Server weiter
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"/Users/medineannamammedova/Documents/AutomationExercise.com/src/app/app-release.apk");
        //ich habe gestutenin path geschrieben, die Codes in das Gerät einzuführen. Ich habe es in APP eingeführt

        //desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.example.yeshasprabhakar.todo");

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        //webElemet yerine MobilWebElemet,AndroindWebelement man kann schreiben
        //appium url geschrieben

        //1. Aufgabe
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("com.example.yeshasprabhakar.todo:id/fab")).click();
        driver.findElement(By.id("com.example.yeshasprabhakar.todo:id/edit_title")).sendKeys("Text");
        driver.findElement(By.id("android:id/button1")).click();

    } 
}
