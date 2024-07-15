package DAO;


import java.util.List;

import metier.entites.Publication;

public class TestPub {
	public static void main(String [] args) {
	 Pub_data_base c = new Pub_data_base(SingletonConnection.getConnection());
	//Date lt= LocalDateTime.now();
	 
	 Publication pub = new Publication ( "titredate","abstractdate",null,"type_pub",32,null, null);
	 
	 
	 System.out.println("****************************************************");
	 //Pub_data_base.savePub(pub);
	
	 System.out.println("****************************************************");
	 List<Publication> listePub = c.PublicationParMc("te");
	 System.out.println(listePub);
	 System.out.println("****************liste des pubs************************************");
	 List<Publication> liste = c.LesPublications();
	 System.out.println(liste);
	 
	 System.out.println("****************liste des pubs par id chercheur************************************");
	 List<Publication> listeParIdChercheur = c.pubParIdChercheur(77);
	 System.out.println(listeParIdChercheur);
	 
	 System.out.println("***********up pub******************************************");
	// Publication pubup = new Publication ( "titredateup","abstractdateup",null,"type_pubup",32,null,null);
	// c.updatePublication(pubup,40);
	 
	 System.out.println("****************fghjk************************************");
	 List<Publication> listeParIdChercheurz =c.listAllPubMc("2021");
	 System.out.println(listeParIdChercheurz);
	 
											}
} 
