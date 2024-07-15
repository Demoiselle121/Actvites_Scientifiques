package DAO;

import java.util.List;

import metier.entites.Equipe;

public class TestEquipe {
	public static void main(String [] args) {
		 Equipe_data_base e = new Equipe_data_base(SingletonConnection.getConnection());
		 Equipe equi = new Equipe ();
		 
		 
		 System.out.println("****************************************************");
		 Equipe_data_base.saveEquipe(equi);
		
		 System.out.println("****************************************************");
		 List<Equipe> listeEqui = e.EquipeParMc("nom");
		 System.out.println(listeEqui);
		 System.out.println("****************************************************");
		 List<Equipe> listeEquipesNom = e.EquipeNom();
		 System.out.println(listeEquipesNom);
		 System.out.println("***************liste des equipes par id_labo *************************************");
		 List<Equipe> listeEquipeParIdLabo = e.NomEquipeParIdLabo(15);
		 System.out.println(listeEquipeParIdLabo);
		 System.out.println("***************nom d'equipe par id  ****************************************");
		 Equipe p = Equipe_data_base.getNomEquipeParId(32);
		 System.out.println(p);
		 System.out.println("*************** equipe par id  ****************************************");
		 Equipe equ = e.getEquipeParId(60);
		 System.out.println(equ);
		 System.out.println("*******************update Equipe Labo ***********************");
		 e.updateEquipeLabo(60);
		 System.out.println("***********up equipe******************************************");
		 Equipe equipeup = new Equipe ();
		// e.updateEquipe(equipeup,1);
		System.out.println("******************************getId****************");
		int c = Equipe_data_base.getId_equipe();
		System.out.println(c);
		 
		 System.out.println("****************************************************");
		// e.deleteEquipe(1);
		 
		 
		 
		 System.out.println("*******************walo*********************************");
		 e.getId_equipe();
}
}
