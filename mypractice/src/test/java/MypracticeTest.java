/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author margaret
 */
public class MypracticeTest {
    private WebDriver driver;
    public MypracticeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
       System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver(); 
  
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
  public void testPricelineTestCase() throws Exception {
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.findElement(By.id("APjFqb")).click();
    driver.findElement(By.xpath("//div[@id='ERWdKc']/div/span")).click();
//    driver.findElement(By.xpath("//div[@id='tads']/div[2]/div/div/div/div/a/div/span")).click();
//    driver.get("https://www.cheapoair.com/flights/booknow/cheap-flight-tickets?fpaffiliate=coa-google-competitor&fpsub=&utm_campaign=competitors_exact_atlas&utm_term=priceline&utm_term_id=kwd-10842441&utm_source={google}&utm_medium={cpc}&device=c&fpprice=&campaignID=938819657&adgroupId=46906257756&gad=1&gclid=CjwKCAjwge2iBhBBEiwAfXDBRwLXj0gfFjk7tu8JCge0xwgZ29QFytGNmdDcG0Y5DuAxUyxogXoTeBoCmbIQAvD_BwE");
//    driver.findElement(By.id("hotels")).click();
//    driver.findElement(By.xpath("//div[@id='panel-2']/div/div/div[2]/div/div/div")).click();
//    driver.findElement(By.xpath("//a[@id='travellerButtonHotel']/div/div")).click();
//    driver.findElement(By.xpath("//a[@id='travellerButtonHotel']/div[2]/div")).click();
//    driver.findElement(By.id("hotelSearchBtn")).click();
//    driver.findElement(By.id("hotelName")).click();
driver.close();
  }
}
