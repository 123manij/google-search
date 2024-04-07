package miniproject;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
public WebDriver launchApplication(String browser) {
		
		WebDriver driver = null;
		switch(browser.toLowerCase()){
		
		//Launching Chrome Browser
		
			case "chrome":
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.get("https://www.google.com/ ");
				driver.manage().window().maximize();
				break;
				
		//Launching Edge browser
				
			case "edge":
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.get("https://www.google.com/ ");
				driver.manage().window().maximize();
				break;
				
		//Launching FireFox browser	
				
			case "firefox":
				 driver = new FirefoxDriver();
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				 driver.get("https://www.google.com/ ");
				 driver.manage().window().maximize();
				 break;
		    		
				
		//Asking to enter valid input
				
			default:
				System.out.println("Enter chrome or edge");
				return null;
		}
		return driver;
	}
	
	   // This method is to print the names and numbers of links in web page
	
	public void links(WebDriver driver)  {
		
		//Counting number of links displayed in the web page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
     	System.out.println("Number of links in the web page: " + links.size());
     	System.out.println("Names of links displayed on web page");
 		System.out.println("-------------------------------------");
 		
 		// Displaying the names of links present in web page
 		
     	for (WebElement link : links) {
     		if(link.getText().equals("")) {
     			System.out.println("Name is not found");
           
     		}
     		else {
     			System.out.println(link.getText());
     		}
     		
        }
	}
	
	//This method is to enter the value and count number of options displayed and print them 
	
     public void SearchCognizant(WebDriver driver)	{
    	 
    	// Object excel;
		//Entering cognizant in the search bar
    	//String ab = excel.dataSet();
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("cognizant");
		
		//Taking screenshot of options displayed
		
		  try {
				TakesScreenshot ts = ((TakesScreenshot) driver);
				
				File sourceFile = ts.getScreenshotAs(OutputType.FILE);
				
				File destinationFile = new File(System.getProperty("user.dir")+"\\Screenshots\\1)webpage.png");
				
				FileUtils.copyFile(sourceFile, destinationFile);
		  }
		  catch (Exception e) {
	            e.printStackTrace();
		  }
		  
		  //Count the number of options displayed after entering the input 
		  
		  List<WebElement> web=driver.findElements(By.xpath("//div[@class='wM6W7d'][@role='presentation']"));
		  System.out.println("-------------------------------------");
			System.out.println("Number of search results displayed after entering cognizant: "+web.size());
			System.out.println("-------------------------------------");
			System.out.println("Names of links displayed on web page");
	 		System.out.println("-------------------------------------");
	 		
	 		//print the names of options displayed after entering the input
	 		
			for(WebElement web2:web) {
				System.out.println(web2.getText());
			
			}
		}
     
           //This method is to click enter after entering input
     
     public void Search(WebDriver driver) {
    	 WebElement web3=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
			web3.sendKeys(Keys.ENTER);
     }
     
     //This method is to Click on "All" option 
     
     public void Allnumberofresults(WebDriver driver) {
    	 
    	 //Click “All” in the google 
//    			try {
//    				WebElement allElement= driver.findElement(By.cssSelector("a[class='zItAnd FOU1zf cLIEsf GMT2kb']"));
//    				if(allElement.isDisplayed()) {
//    					allElement.click();
//    				}
//    			}
//    			catch(Exception e) {
//    			}
//    	 
    	 WebElement qq=driver.findElement(By.xpath("//div[@id='result-stats']"));
    	 
    	 //Display the number of results displayed like "About XXXXX results "
    	 
 		String ab=qq.getText();
 		ab=ab.replace(driver.findElement(By.tagName("nobr")).getText(),"");
 		System.out.println("-------------------------------------");
 		System.out.println("Number of search results displayed as “About XXXXX results after click All option: "+ab.trim());
 		
 		//Take screenshot after click on All option
 		
 		 try {
 				TakesScreenshot ts = ((TakesScreenshot) driver);
 				
 				File sourceFile = ts.getScreenshotAs(OutputType.FILE);
 				
 				File destinationFile = new File(System.getProperty("user.dir")+"\\Screenshots\\2)All.png");
 				
 				FileUtils.copyFile(sourceFile, destinationFile);
 		  }
 		  catch (Exception e) {
 	            e.printStackTrace();
 		  }
 	}
     
   //This method is to Click on "News" option 
     
     public void Newsnumberofresults(WebDriver driver) {
    	 
    	 //Click “News” in the google
    	 
    	 WebElement web5=driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/div/div[1]/div[1]/a/div/span"));
 		web5.click();
 		
 		//Number of search results displayed as “About XXXXX results
 		
 		WebElement qq1=driver.findElement(By.xpath("//div[@id='result-stats']"));
 		String ab1=qq1.getText();
 		ab1=ab1.replace(driver.findElement(By.tagName("nobr")).getText(),"");
 		System.out.println("-------------------------------------");
 		System.out.println("Number of search results displayed as “About XXXXX results after click News option: "+ab1.trim());
 		 
 		//Take screenshot after click on News option
 		
 		try {
 				TakesScreenshot ts = ((TakesScreenshot) driver);
 				
 				File sourceFile = ts.getScreenshotAs(OutputType.FILE);
 				
 				File destinationFile = new File(System.getProperty("user.dir")+"\\Screenshots\\3)News.png");
 				
 				FileUtils.copyFile(sourceFile, destinationFile);
 		  }
 		  catch (Exception e) {
 	            e.printStackTrace();
 		  }
     }
     
     ////This method is to Click on "Image" option 
     
     public void Imagenumberofresults(WebDriver driver) {
    	 
    	// Click “Images” in the google.
    	 
    	 WebElement web6=driver.findElement(By.xpath("//*[@id=\"cnt\"]/div[3]/div/div/div[1]/div[1]/div/a[4]/div"));
 		web6.click();
 		
 		//Take screenshot after click on image option
 		
 		 try {
 				TakesScreenshot ts = ((TakesScreenshot) driver);
 				
 				File sourceFile = ts.getScreenshotAs(OutputType.FILE);
 				
 				File destinationFile = new File(System.getProperty("user.dir")+"\\Screenshots\\4)Images.png");
 				
 				FileUtils.copyFile(sourceFile, destinationFile);
 		  }
 		  catch (Exception e) {
 	            e.printStackTrace();
 		  }
     }
     
   //This method is to Click on "Videos" option 
     
     public void Videosnumberofresults(WebDriver driver) {
    	 
    	// Click “Videos” in the google
    	 
    	 WebElement web7=driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[2]/c-wiz/div[1]/div/div[1]/div[1]/div/div/a[4]"));
 		web7.click();
 		
 		//Take screenshot after click on Videos option
 		
 		 try {
 				TakesScreenshot ts = ((TakesScreenshot) driver);
 				
 				File sourceFile = ts.getScreenshotAs(OutputType.FILE);
 				
 				File destinationFile = new File(System.getProperty("user.dir")+"\\Screenshots\\5)Videos.png");
 				
 				FileUtils.copyFile(sourceFile, destinationFile);
 		  }
 		  catch (Exception e) {
 	            e.printStackTrace();
 		  }
 		 
 		//Number of search results displayed as “About XXXXX results
 		 
 		WebElement qq2=driver.findElement(By.xpath("//div[@id='result-stats']"));
 		String ab2=qq2.getText();
		ab2=ab2.replace(driver.findElement(By.tagName("nobr")).getText(),"");
		System.out.println("-------------------------------------");
		System.out.println("Number of search results displayed as “About XXXXX results after click Video option: "+ab2.trim());
     }
     
     ////This method is to close Browser
     
     public void Close(WebDriver driver) {
    	 driver.quit();
     }
     

}
