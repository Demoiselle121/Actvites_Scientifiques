package DAO;

import java.util.List;

import metier.entites.Soutenance;

public class TestSoutenance {
	public static void main(String [] args) {
		 Soutenance_data_base s = new Soutenance_data_base(SingletonConnection.getConnection());
		 Soutenance sout = new Soutenance ( "type ","intitule",null, "lieu",34,null,null);
		 
		 
		 System.out.println("****************************************************");
		// Soutenance_data_base.saveSoutenance(sout);
		
		 System.out.println("****************************************************");
		 List<Soutenance> listeSoutparMc = s.SoutenanceParMc("type");
		 System.out.println(listeSoutparMc);
		 System.out.println("*******************listes des out*********************************");
		 List<Soutenance> listeSout = s.ListesSoutenances();
		 System.out.println(listeSout);
		 
		 System.out.println("***********up sout******************************************");
		 Soutenance souteup = new Soutenance( "typeup ","intituleup ",null, "lieuup ",32,null,null);
		 //s.updateSoutenance(souteup,34);
		 
		 System.out.println("****************************************************");
		 //s.deleteSoutenance(34);
		 System.out.println("**********************type soutenance ******************");
		 List<String> st = s.SoutenanceParType();
		 System.out.println(st);
		 System.out.println("**********************intitule soutenance ******************");
		 List<String> sou= s.SoutenanceParIntitule();
		 System.out.println(sou);
}
}
