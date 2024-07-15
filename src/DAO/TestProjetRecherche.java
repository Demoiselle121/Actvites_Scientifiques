package DAO;

import java.util.List;
import metier.entites.ProjetRecherche;

public class TestProjetRecherche {
	
	public static void main(String [] args ) {
		
	ProjetRecherche_data_base projetrech= new ProjetRecherche_data_base(SingletonConnection.getConnection());
	ProjetRecherche prj = new ProjetRecherche("test","test",12345,null,null,32);
	System.out.println("********************************************************");
	ProjetRecherche_data_base.saveProjetRecherche(prj);
	System.out.println("********************************************************");
	List<ProjetRecherche> listePrj = projetrech.listeProduits();
	System.out.println(listePrj);
	System.out.println("********************************************************");
	List<ProjetRecherche> listePrjMc = projetrech.ProjetRechercheParMc("te");
	System.out.println(listePrjMc);
	System.out.println("*********************liste ProjetRecherche***********************************");
	List<ProjetRecherche> listeProjetRcherche = projetrech.ListeDProjetDRecherche();
	System.out.println(listeProjetRcherche);
	System.out.println("*********************liste ProjetRecherche***********************************");
	List<ProjetRecherche> listePrjt = projetrech.LesProjet();
	System.out.println(listePrjt);
	 
	 System.out.println("**************modify a project ******************************************");
	 
	 ProjetRecherche prjup = new ProjetRecherche("testup","testup",99999,null,null,32);
	 ProjetRecherche_data_base.updateProjetRecherche(prjup,18);
		
	 System.out.println("**************delete a project ******************************************");
	 
	// ProjetRecherche_data_base.deleteProjetRecherche("test");
	
	}
	}
