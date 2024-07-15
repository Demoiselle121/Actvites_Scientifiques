package DAO;

import java.util.List;

import metier.entites.Labo;




public class TestLabo {
	public static void main(String []args) {
		
	Labo_data_base l = new Labo_data_base(SingletonConnection.getConnection());
	Labo labo = new Labo ("nomlabo");
	System.out.println("***************save labo************************");
	//Labo_data_base.saveLab(labo);
	System.out.println("***************liste  labo************************");
	List<Labo> listeLabo = l.LaboParMc("la");
	//System.out.println(listeLabo);
	System.out.println("***************liste  labo************************");
	//List<Labo> Labos = l.LaboNom();
	//System.out.println(Labos);
	 System.out.println("***********up labo******************************************");
	 Labo laboup = new Labo ( "titredateup");
	// l.updateLabo(laboup,1);
	 
	 System.out.println("*******************delete labo*********************************");
	//l.deleteLabo(1);
	 System.out.println("*******************delete labo*********************************");
		int la =l.getId_labo();
		System.out.println(la);
		
	 
	
}
}

