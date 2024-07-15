package DAO;

import metier.entites.chercheur_Model;


public class test_login {
 public static void main(String [] args )
 {
	 chercheur_Model user = new chercheur_Model("hiba","ELKAAM","4002","docteur","email@",0537,null,"responsabilite","responsabilite pedago",0,0);
	 login_data_base test= new login_data_base();
	 try {
		test.validate(user);
		System.out.println("c fait");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
 
 }
}
