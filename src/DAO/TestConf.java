package DAO;

import java.sql.Date;
import java.util.List;

import metier.entites.Conference;



public class TestConf {
	public static void main(String [] args) {
		 Conference_data_base c = new Conference_data_base(SingletonConnection.getConnection());
		 Date d =new Date(2021/01/02);
		 Conference conf = new Conference("type_conference","intitule_conference",null,"lieu_conference",31,d,null); 
		 
		 System.out.println("****************************************************");
		 //c.saveConf(conf);
		 
		 System.out.println("*****************afficher par type ***********************************");
		 List<String> listeConft = c.ConferenceParType();
		 System.out.println(listeConft);
		 System.out.println("*****************afficher par intitule***********************************");
		 List<String> listeConfi= c.ConferenceParIntitule();
		 System.out.println(listeConfi);
		 System.out.println("*****************afficher liste des conf ***********************************");
		 List<Conference> liste= c.ListesConferences();
		 System.out.println(liste);
		 
		 System.out.println("*****************************************************");
		 Conference confup = new Conference( "type_conferenceup","intitule_conferenceup",null,"lieu_conferenceup",31,null,null);
		 //c.updatConf(confup,1);
		 
		 System.out.println("****************************************************");
		//c.deleteConference(1);
		 
}
}
