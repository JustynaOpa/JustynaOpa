package com.justi.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FrontendTestApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver2.exe");
        WebDriver webDriver = new ChromeDriver();
        //webDriver.get("https://ta-ebookrental-fe.herokuapp.com/register");

         //Register the new user
        WebElement login = webDriver.findElement(By.xpath("//html/body/div/div/form/div/label/input"));
        login.sendKeys("fiona13");

        WebElement password = webDriver.findElement(By.xpath("//*[@class =\"container\"]/form/div[2]/label/input"));
        password.sendKeys("password0");

        WebElement repeatPassword = webDriver.findElement(By.xpath("//*[@class =\"container\"]/form/div[3]/label/input"));
        repeatPassword.sendKeys("password0");

        WebElement signUp = webDriver.findElement(By.xpath("//*[@class = \"flex\"]/button"));
        signUp.click();

        // LogIn
        webDriver.get("https://ta-ebookrental-fe.herokuapp.com/login");
        WebElement login1 = webDriver.findElement(By.xpath("//*[@class =\"container\"]/form/div/label/input"));
        login1.sendKeys("fiona13");
        WebElement password1 = webDriver.findElement(By.xpath("//*[@class =\"container\"]/form/div[2]/label/input"));
        password1.sendKeys("password0");
        WebElement log = webDriver.findElement(By.xpath("//*[@class = \"flex\"]/button"));
        log.click();

//        try{
//            Thread.sleep(5000);
//        }
//        catch(InterruptedException ie){
//        }
//
//      webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait=new WebDriverWait(webDriver, 7);
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//html/body/div/div/div/ul/li/div[2]/a/button"))));
        webDriver.findElement(By.xpath("//html/body/div/div/div/ul/li/div[2]/a/button")).click();

        // Renting a book
        WebElement showCopies = webDriver.findElement(By.xpath("//html/body/div/div/div/ul/li/div[2]/a/button"));
        showCopies.submit();
        WebElement showHistory = webDriver.findElement(By.xpath("//*[class = \"container\"]/div/ul/li/div[2]/a/button"));
        showHistory.submit();
        WebElement rentThisCopy = webDriver.findElement(By.xpath("//*[class = \"container\"]/div/button"));
        rentThisCopy.submit();
        WebElement customerName = webDriver.findElement(By.xpath("//*[class = \"container\"]/div/div/div/form/div/label/input"));
        customerName.sendKeys("fiona13");
        WebElement addCopy = webDriver.findElement(By.xpath("//*[class = \"container\"]/div/div[2]/div/form/button"));
        addCopy.submit();
        WebElement returnButton = webDriver.findElement(By.xpath("//*[class = \"container\"]/div/div/button"));
        returnButton.click();
        returnButton.click();


        // Addition new title
        WebElement addNewT = webDriver.findElement(By.xpath("//html/body/div/div/div/button"));
        addNewT.submit();

        WebElement title = webDriver.findElement(By.xpath("//*[@class =\"container\"]/div/div/div/form/div/label/input"));
        title.sendKeys("The Witcher");
        WebElement author = webDriver.findElement(By.xpath("//*[@class =\"container\"]/div/div/div/form/div[2]/label/input"));
        author.sendKeys("A. Sapkowski");
        WebElement year = webDriver.findElement(By.xpath("//*[@class =\"container\"]/div/div/div/form/div[2]/label/input"));
        year.sendKeys("2012");

        WebElement addNew = webDriver.findElement(By.xpath("//*[@class =\"container\"]/div/div/div/form/button"));
        addNew.click();

        // Addition new copy of the book
        addNewT.submit();

        WebElement purchaseData = webDriver.findElement(By.xpath("//*[@class =\"container\"]/div/div[2]/div/form/div/div/div/div/input"));
        purchaseData.submit();
        WebElement next= webDriver.findElement(By.xpath("//*[@class = \"date-picker\"]/div/div[2]/header/span[3]"));
        next.click();
        next.click();
        WebElement dayPicker = webDriver.findElement(By.xpath("//*[@class = \"date-picker\"]/div/div[2]/div/span[24]"));
        dayPicker.click();
        addCopy.click();

        //Removing copy of the book
        showCopies.click();
        WebElement remove = webDriver.findElement(By.xpath("//*[@class = \"container\"]/div/ul/li[2]/div[2]/button[2]"));
        remove.click();

        // Edition of the book
        WebElement edit = webDriver.findElement(By.xpath("//*[@class = \"container\"]/div/ul/li/div[2]/button"));
        edit.click();
        year.clear();
        year.sendKeys("2016");

        //Removing element
        remove.click();
    }
}




