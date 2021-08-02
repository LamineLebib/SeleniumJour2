package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.manage().window().maximize();
		
		// les lignes �crites pr�c�demment sont les plus importantes apr�s eclipse nous propose toutes les m�thodes
		//driver.getPageSource(); // comme �a le code s'ex�cute mais on ne voit rien dans la console donc il faut l,afficher
		String codeSource = driver.getPageSource(); // pour afficher tout le code source html de la page ici sur eclipse
		System.out.println("Le code source est le: "+ codeSource);
		
		if(codeSource.contains("OrangeHRM")); // contains pour voir si le code contient.....
			System.out.println("passed");
		
	}

}

