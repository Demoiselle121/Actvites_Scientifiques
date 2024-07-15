
  package DAO;
  
  import java.util.List;
  
  import metier.entites.Axe_recherche_equipe;
  
  
  public class TestAxe_recherche_equipe { 
	  public static void main(String []args) { 
		  Axe_recherche_equipe_data_base c = new Axe_recherche_equipe_data_base(SingletonConnection.getConnection());
          Axe_recherche_equipe axe = new Axe_recherche_equipe ();
  
  System.out.println("****************************************************");
  Axe_recherche_equipe_data_base.saveAxe_recherche_equipe(axe, 5, 5);
	/*
	 * System.out.println("****************************************************");
	 * List<Axe_recherche_equipe> listeAxeRechercheEquipe =
	 * c.Axe_recherche_equipeParMC("titre");
	 * System.out.println(listeAxeRechercheEquipe);
	 * 
	 * System.out.
	 * println("***********up pub******************************************");
	 * Axe_recherche_equipe pubup = new Axe_recherche_equipe ( "titredateup",32);
	 * c.updateAxe_recherche_equipe(pubup,1); System.out.println(
	 * "***********getAxeREquipeParId******************************************");
	 * Axe_recherche_equipe axeREquipe =
	 * Axe_recherche_equipe_data_base.getAxeREquipeParId(2);
	 * System.out.println(axeREquipe);
	 * 
	 * System.out.println("****************************************************");
	 * //c.deleteAxe_recherche_equipe(1);
	 */  
  } }
 
