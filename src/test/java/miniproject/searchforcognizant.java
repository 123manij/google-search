package miniproject;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class searchforcognizant {
	
	public static void main(String[] args) {
		Methods m = new Methods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Browser:");
		System.out.println("-------------------------------------");
		String browser = sc.nextLine();
		sc.close();
		WebDriver driver=m.launchApplication( browser);
		m.links(driver);
		m.SearchCognizant(driver);
		m.Search( driver);
		m.Allnumberofresults(driver);
		m.Newsnumberofresults(driver);
		m.Imagenumberofresults(driver);
		m.Videosnumberofresults(driver);
		m.Close(driver);
		System.out.println("XXXXXXXXXX-The program is Excuted-XXXXXXXXXX");
		}


}
