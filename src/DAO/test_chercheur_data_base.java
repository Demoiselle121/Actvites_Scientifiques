package DAO;

import java.sql.SQLException;
import java.util.List;


import metier.entites.chercheur_Model;

public class test_chercheur_data_base {
	public static void main (String [] args ) throws SQLException
	{
	chercheur_data_base c = new chercheur_data_base(SingletonConnection.getConnection());
	chercheur_Model chercheur = new chercheur_Model("hiba","ELKAAM","400ghj2","docteur","email@",0537,null,"responsabilite","responsabilite pedago");
	//c.saveUser1(chercheur) ;
	//---------------------------------------------------------------------------------------
	
	 List<chercheur_Model> listeProf = c.ChercheurPrpf();
	 System.out.println(listeProf);
	 
	 System.out.println("**************modify a chercheur ******************************************");
	 
	 chercheur_Model cherc = new chercheur_Model("hibadfghjk","ELKAAM","4002","docteur","email@",0537,null,"responsabilite","responsabilite pedago",32,17);
	 chercheur_data_base.updateChercheur(cherc,263);
	 System.out.println("**************get chercheru par pass and username ******************************************");
	 
	 chercheur_Model chparuserandpass =chercheur_data_base.getIdChercheurParPassAndUser("Hiba", "hiba");
	 System.out.println(chparuserandpass);
		
	 System.out.println("**************delete a chercheur ******************************************");
	 
	chercheur_data_base.deleteChercheur(40);
	
	System.out.println("**************get  chercheur par id ******************************************");
	
	chercheur_Model che = chercheur_data_base.getCherchParId(34);
	System.out.println(che);
	System.out.println("**************get resons ******************************************");
	
	List<String> liste_respon = c.Respnsabilte_chercheur();
	 System.out.println(liste_respon);
	
	System.out.println("*****************set id equipe = null***************");
	c.updateChercheur(che, 32);
	
	System.out.println("**************get resonspon pedago******************************************");
	
	List<String> liste_respon_pedago= c.RespnsabiltePedago_chercheur();
	 System.out.println(liste_respon_pedago);
		System.out.println("**************get type cher******************************************");
		
		List<String> liste_type_chercheur =  c.type_chercheur();
		 System.out.println(liste_type_chercheur);
		 
		 System.out.println("**************get type cher******************************************");
			
		String type_chercheur =  chercheur_data_base.getTypeChercheur();
			 System.out.println(type_chercheur);
			 System.out.println("*******************getIdchercheurParIdEquipe************************");
			 List<chercheur_Model> listeChercheurParIdEquipe = chercheur_data_base.NomChercheurParIdEquipe(60);
			 System.out.println(listeChercheurParIdEquipe);
	}

	}

	/*System.out.println("*****************idEquipe********************");
	List<Integer> id_equipe = c.getIdEquipe();
	System.out.println(id_equipe);
	}*/
	

