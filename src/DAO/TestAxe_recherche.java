package DAO;

import java.util.List;

import metier.entites.Axe_recherche;


public class TestAxe_recherche {
	public static void main(String [] args) {
		Axe_recherche_data_base a = new Axe_recherche_data_base(SingletonConnection.getConnection());
		Axe_recherche axe = new Axe_recherche("nom_axe");
		 
		System.out.println("****************************************************");
		a.saveAxe_recherche(axe);
		System.out.println("****************************************************");
		List<Axe_recherche> listeAxeRecherche = a.Axe_rechercheParMC("nom");
		System.out.println(listeAxeRecherche);
		 
		System.out.println("***********up pub******************************************");
		Axe_recherche axeup= new Axe_recherche ( "nom axe labo_up");
		//a.updateAxe_recherche(axeup,1);
		 
		System.out.println("*************ndfz***************************************");
		//a.deleteAxe_recherche(1);
		List<Axe_recherche> listeAxe = a.ListeAxeParEquipe(60);
		System.out.println(listeAxe);

}
}
