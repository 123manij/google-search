package Searchcognizant;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;


public class main {

	public static void main(String[] args) throws IOException   {
			cognizant m = new cognizant();
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


