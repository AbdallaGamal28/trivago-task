package com.trivago.automation;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.trivago.automation.AppConstants.*;

/**
 * @author Abdalla
 * email  abdalla.gamal.abdalla@gmail.com
 * date 14-Sep-2019
 * description 
 *    ** this class to test the main page of trivago Job posts
 */

public class JobProfileTestCase {

	private WebDriver driver;

	{
		System.setProperty("webdriver.chrome.driver", AppConstants.DRIVER_PATH);
		driver = new ChromeDriver();
	}

	public void wait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	/**
	 * Description 
	 * 		** This test case is to retrieve the job profiles  and to check if it is dynamically retrieved
	 * @throws Exception
	 */
	
	@Test
	public void testJobProfile() throws Exception {
		driver.get(POSITIONS_URL);
		wait(10);
		WebElement mytable = driver.findElement(By.xpath(POSITIONS_TABLE));
		List<WebElement> elements = mytable.findElements(By.tagName("tr"));
		System.out.println("Opening Positions Count = " + elements.size());
		
		for (int i = 1; i < elements.size(); i++) {
			WebElement position = driver.findElement(By.xpath(POSITIONS_TABLE_ROW +  "[" + i + "]"));
			System.out.println("Check the following Job Profile ::: " + position.getText());
			position.click();
			wait(5);
			checkJobFields();
			driver.navigate().back();
		}
	}

	/**
	 * Description
	 * **This function (checkJobFields) contain all the below
	 * Job title should have a <h1> tag
	 *Job Family should have a value
	 *Experience level should have a value
	 *Location should have a value
	 *Language should have a value
	 *Apply button should be present on the page
	 *What you’ll do should have a <b> tag
	 *What you’ll definitely need should have <b> tag
	 *What we’d love you to have should have <b> tag
	 **/
	
	
	void checkJobFields() {
		String jobTitle = driver.findElement(By.xpath(JOB_TITLE)).getTagName();
		String jobFamily = driver.findElement(By.xpath(JOB_FAMILY)).getText();
		String jobLanguage = driver.findElement(By.xpath(LANGUAGE)).getText();
		String jobLocation = driver.findElement(By.xpath(LOCATION)).getText();
		String experienceLevel = driver.findElement(By.xpath(EXPERIENCE_LEVEL)).getText();
		WebElement applyBtn1 = driver.findElement(By.xpath(APPLY_BTN1));
		WebElement applyBtn2 = driver.findElement(By.xpath(APPLY_BTN2));
		String whatYouDo = driver.findElement(By.xpath(WHAT_YOU_DO)).getTagName();
		String whatYouNeed = driver.findElement(By.xpath(WHAT_YOU_NEED)).getTagName();
		String whatWeLove = driver.findElement(By.xpath(WHAT_WE_LOVE)).getTagName();

		System.out.println("Job Title tag name  :: " + jobTitle);
		System.out.println("Job Family :: " + jobFamily);
		System.out.println("Job Language :: " + jobLanguage);
		System.out.println("Job Location :: " + jobLocation);
		System.out.println("Experience Level :: " + experienceLevel);
		System.out.println("Apply Button 1 :: " + applyBtn1);
		System.out.println("Apply Button 2 :: " + applyBtn2);
		System.out.println("What you do tag name  :: " + whatYouDo);
		System.out.println("What you need tag name  :: " + whatYouNeed);
		System.out.println("What we love tag name : " + whatWeLove);

		assertEquals(jobFamily.length() > 0, true);
		assertEquals(jobLanguage.length() > 0, true);
		assertEquals(jobLocation.length() > 0, true);
		assertEquals(experienceLevel.length() > 0, true);
		assertNotNull(applyBtn1);
		assertNotNull(applyBtn2);
		assertEquals(jobTitle, "h1");
		assertEquals(whatYouDo, "b");
		assertEquals(whatYouNeed, "b");
		assertEquals(whatWeLove, "b");
	}
}
