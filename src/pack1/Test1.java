package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe"); // sert à localiser le driver, spécifier le chemain
		
		/*
		 maintenant On va créer l'instance de la classe qu'on va utiliser. L'interface webdriver est une classe abstraite qui décrit 
		 toutes les méthodes et des actions possibles sur des navigateurs web et vu qu'on veut travailler sur chrome,
		 on doir créer une classe pour ça car on ne peut pas créer une instance pour une classe abstraite donc on va 
		 créer une instance de la classe ChromeDriver par contre il faut montrer à eclypse où se trouve le package de librairie.
		 on va dans le projet, clique droit, propreties/java build path/Libraries/classpath/addJARs après cliquer
		 sur le projet, ouvrir labraries, et selectionner le contenue de librairies et clique ok et là on peut importer la ligne 3 et 4
		 */
		
		WebDriver driver = new ChromeDriver(); /* pouquoi on a ecrit WebDriver au début et non pas ChromeDriver car c'est le polymorphise
		Web driver c'est la classe abstraite et ChromeDriver est la classe qui va implémenter les méthodes de la classe WebDriver
		On peut utiliser ChromeDriver driver = new ChromeDriver(); c'est juste par contre ici on a créer une variable qui va prendre juste la forme de chrome alors 
		que la première on a créer une variable qui peut prendre plusieurs forme donc on utilise toujours la première syntaxe
		*/
		
		//Si on éxécute mnt, une page chrome s'ouvre (objet créé mais elle est vide) donc on ouvre une instance du navigateur en question
		//mnt on va utiliser les méthodes
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // on met l'url pour la page qu'on veut ouvrir);
		// donc la méthode get set à ouvrir la page qu'on veut) mais elle s'ouvre pas avec la bonne taille (pleine écran) donc on a utilser manage
		
		driver.manage().window().maximize(); //maximiser l'affichage de la fenêtre
		
		String titlePage = driver.getTitle(); //pour récupérer le titre de la page web et on va mettre le titre dans la variable qu'on crée(titlePage)
												//si on met la sourie sur getTitle ça nous montre le type de retour(String)
		System.out.println("le titre est: "+ titlePage );
		
		if(titlePage.equals("OrangeHRM"))
			System.out.println("Le test titre est réussi");
		else
			System.out.println("Le test titre a échoué");
		
		String urlCourrant = driver.getCurrentUrl();
		
		if(urlCourrant.equals("https://opensource-demo.orangehrmliv.com/"))
			System.out.println("Le test URL est réussi");
		else
			System.out.println("Le test URL a échoué");
				
	}

}
