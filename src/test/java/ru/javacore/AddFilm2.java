package ru.javacore;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddFilm2 extends ru.javacore.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testAddFilm2() throws Exception {
    driver.get(baseUrl + "/php4dvd/");
    driver.findElement(By.cssSelector("img[alt=\"Add movie\"]")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("lost");
    driver.findElement(By.name("year")).clear();
    driver.findElement(By.name("year")).sendKeys("1992");
    driver.findElement(By.name("duration")).clear();
    driver.findElement(By.name("duration")).sendKeys("12");
    driver.findElement(By.name("notes")).clear();
    driver.findElement(By.name("notes")).sendKeys("13");
    driver.findElement(By.name("taglines")).clear();
    driver.findElement(By.name("taglines")).sendKeys("14");
    driver.findElement(By.name("plots")).clear();
    driver.findElement(By.name("plots")).sendKeys("15");
    driver.findElement(By.id("submit")).click();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
