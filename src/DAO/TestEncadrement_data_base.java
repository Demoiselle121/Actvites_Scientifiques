package DAO;

import java.util.List;

import metier.entites.Encadrement;

public class TestEncadrement_data_base {
	public static void main(String [] args) {
		 Encadrement_data_base en = new Encadrement_data_base(SingletonConnection.getConnection());
		 Encadrement enc = new Encadrement ( "type ","intitule","niveau",null,null,34,null,"hl");
		 
		 
		 System.out.println("****************************************************");
		 //Encadrement_data_base.saveEncadrement(enc);
		
		 System.out.println("****************************************************");
		 List<Encadrement> listeEnc = en.EncadrementParMc("type");
		 System.out.println(listeEnc);
		 System.out.println("******************liste des encadr:**********************************");
		 List<Encadrement> liste = en.ListesEncadrements();
		 System.out.println(liste);
		 
		 System.out.println("***********up encadrement******************************************");
		 Encadrement listeEncup = new Encadrement( "typeup ","intituleup","niveauup",null,null,32,null,"fj");
		// en.updateEncadrement(listeEncup,1);
		 
		 System.out.println("****************************************************");
		 en.deleteEncadrement(1);
}
}
