package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe"); // sert � localiser le driver, sp�cifier le chemain
		
		/*
		 maintenant On va cr�er l'instance de la classe qu'on va utiliser. L'interface webdriver est une classe abstraite qui d�crit 
		 toutes les m�thodes et des actions possibles sur des navigateurs web et vu qu'on veut travailler sur chrome,
		 on doir cr�er une classe pour �a car on ne peut pas cr�er une instance pour une classe abstraite donc on va 
		 cr�er une instance de la classe ChromeDriver par contre il faut montrer � eclypse o� se trouve le package de librairie.
		 on va dans le projet, clique droit, propreties/java build path/Libraries/classpath/addJARs apr�s cliquer
		 sur le projet, ouvrir labraries, et selectionner le contenue de librairies et clique ok et l� on peut importer la ligne 3 et 4
		 */
		
		WebDriver driver = new ChromeDriver(); /* pouquoi on a ecrit WebDriver au d�but et non pas ChromeDriver car c'est le polymorphise
		Web driver c'est la classe abstraite et ChromeDriver est la classe qui va impl�menter les m�thodes de la classe WebDriver
		On peut utiliser ChromeDriver driver = new ChromeDriver(); c'est juste par contre ici on a cr�er une variable qui va prendre juste la forme de chrome alors 
		que la premi�re on a cr�er une variable qui peut prendre plusieurs forme donc on utilise toujours la premi�re syntaxe
		*/
		
		//Si on �x�cute mnt, une page chrome s'ouvre (objet cr�� mais elle est vide) donc on ouvre une instance du navigateur en question
		//mnt on va utiliser les m�thodes
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // on met l'url pour la page qu'on veut ouvrir);
		// donc la m�thode get set � ouvrir la page qu'on veut) mais elle s'ouvre pas avec la bonne taille (pleine �cran) donc on a utilser manage
		
		driver.manage().window().maximize(); //maximiser l'affichage de la fen�tre
		
		String titlePage = driver.getTitle(); //pour r�cup�rer le titre de la page web et on va mettre le titre dans la variable qu'on cr�e(titlePage)
												//si on met la sourie sur getTitle �a nous montre le type de retour(String)
		System.out.println("le titre est: "+ titlePage );
		
		if(titlePage.equals("OrangeHRM"))
			System.out.println("Le test titre est r�ussi");
		else
			System.out.println("Le test titre a �chou�");
		
		String urlCourrant = driver.getCurrentUrl();
		
		if(urlCourrant.equals("https://opensource-demo.orangehrmliv.com/"))
			System.out.println("Le test URL est r�ussi");
		else
			System.out.println("Le test URL a �chou�");
				
	}

}
