package com.stepdefenitions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.base.Base_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Redirect_To_Home 
{
	public static WebDriver driver;

	public static Properties prop;

	public static FileReader input;

	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() throws IOException 
	{
		input=new FileReader("C:\\Rama\\workspace\\DSAlgo\\src\\test\\resources\\Config\\config.properties");
		
		

		
		prop.load(input);
	


System.out.print(prop.getProperty("browser"));

	ChromeOptions chromeoptions = new ChromeOptions();
	chromeoptions.addArguments("--remote-allow-origins=*");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(chromeoptions);
	driver.manage().window().maximize();
	driver.get(prop.getProperty("home_url"));

	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	    System.out.print("rama");
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() 
	{
		System.out.print("sneha");
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() 
	{
		System.out.print("swapna");
	}





}
