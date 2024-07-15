package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entites.Conference;
import metier.entites.Publication;
import metier.entites.chercheur_Model;


public class Conference_data_base {
static Connection connection;
	
	public Conference_data_base(Connection connection ) {
		Conference_data_base.connection = connection;
	}
	//**********************saveConf*****************************************************
	
	public static boolean saveConf(Conference conf){
		boolean set= false;
		try {
	
		String query1 = "insert into conference(type_conference,intitule_conference,justificatif_conference,lieu_conference,id_chercheur,date_conference,pdfConf) values(?,?,?,?,?,?,?);";
		PreparedStatement pt1 = (PreparedStatement) connection.prepareStatement(query1);
		pt1.setString(1, conf.getType_conference());
		pt1.setString(2 , conf.getIntitule_conference());
		
		pt1.setBytes(3, conf.getJustificatif_conference());
		pt1.setString(4, conf.getLieu_conference());
		pt1.setInt(5, conf.getId_chercheur());
		pt1.setDate(6, conf.getDate_conference());
		pt1.setBytes(7, conf.getPdfConf());

		
		pt1.executeUpdate();
		set = true;
		System.out.println("c fait ");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return set ;
	}
	void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
	
//////////////////////////////////////justifiacti_pub(id)/////////////////////////////////
public static byte[] getJustifiactif_Conf_conf(int id_conference){
byte[] justif = null ;
try {	
String query2 = "SELECT justificatif_conference from conference WHERE id_conference=? ";
PreparedStatement ps =connection.prepareStatement(query2);

ps.setInt(1,id_conference);

ResultSet rs=ps.executeQuery();
if(rs.next()) {


justif = rs.getBytes("justificatif_conference");	



}

} catch (Exception e) {

e.printStackTrace();
}
return justif;


}

//////////////////////////////////////justifiacti_pub(id)/////////////////////////////////
public static byte[] getConf(int id_conference){
byte[] justif = null ;
try {	
String query2 = "SELECT pdfConf from conference WHERE id_conference=? ";
PreparedStatement ps =connection.prepareStatement(query2);

ps.setInt(1,id_conference);

ResultSet rs=ps.executeQuery();
if(rs.next()) {
	
justif = rs.getBytes("pdfConf");	


}

} catch (Exception e) {

e.printStackTrace();
}
return justif;


}
	//***********************************Liste des Conferences****************************
	 public List<Conference> ListesConferences(){
			List<Conference> ListesConferences = new ArrayList<Conference>();
			try {
		String query = "SELECT * FROM conference ";
		PreparedStatement pt =connection.prepareStatement(query);
		ResultSet r = pt.executeQuery();
		
		while(r.next()) {
			Conference p = new Conference();
			p.setId_conference(r.getInt("id_conference"));
			p.setType_conference(r.getString("type_conference"));
			p.setIntitule_conference(r.getString("intitule_conference"));
			p.setJustificatif_conference(r.getBytes("justificatif_conference"));
			p.setLieu_conference(r.getString("lieu_conference"));
			p.setId_chercheur(r.getInt("id_chercheur"));
			p.setDate_conference(r.getDate("date_conference"));
			p.setPdfConf(r.getBytes("pdfConf"));
			
	      
			ListesConferences.add(p);
			System.out.println("c fait ");
						}
				}catch(Exception e) {
		e.printStackTrace();
		}
			return ListesConferences;
			
		
	}
	//********************************afficher par mc type ***********************
	public List<String> ConferenceParType(){
		List<String> listeConfParType = new ArrayList<String>();
		try {
	String query2 = "SELECT * FROM conference";
	PreparedStatement pt2 =connection.prepareStatement(query2);
	
	ResultSet rs = pt2.executeQuery();
	String ConfType = null;
	while(rs.next()) {
		ConfType =  rs.getString("type_conference");
		 listeConfParType.add(ConfType);
		System.out.println("c fait ");
					}
	
	
			}catch(Exception e) {
	e.printStackTrace();
	}
		return listeConfParType;
		
	
}
	//********************************afficher par mc intitule***********************
		public List<String> ConferenceParIntitule(){
			List<String> listeConf = new ArrayList<String>();
			try {
		String query2 = "SELECT * FROM conference";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		
		ResultSet rs = pt2.executeQuery();
		String ConfInti = null;
		while(rs.next()) {
			
			
			ConfInti=rs.getString("intitule_conference");
			
			listeConf.add(ConfInti);
			System.out.println("c fait ");
						}
		
		
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listeConf;
			
		
	}
		
	
	//*************************************update conf **************************
	public Conference updatConf(Conference p,int id )
	{
		try {
			String query3 = "update conference set type_conference =? ,intitule_conference =?,justificatif_conference =?,lieu_conference=?,id_chercheur=?, date_conference=?,pdfConf = ?  where id_conference =?";
			PreparedStatement pt3 = connection.prepareStatement(query3);
			
			pt3.setString(1, p.getType_conference());
			pt3.setString(2, p.getIntitule_conference());
			pt3.setBytes(3, p.getJustificatif_conference());
			pt3.setString(4, p.getLieu_conference());
			pt3.setInt(5, p.getId_chercheur());
			pt3.setDate(6, p.getDate_conference());
			pt3.setBytes(7, p.getPdfConf());
			
			
			pt3.setInt(7,id);
			pt3.executeUpdate();
			System.out.println("c fait");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	
	//************************public List<Conference> ConfParIdChercheur(int id)*******************************
	
			public static List<Conference> ConfParIdChercheur(int id){
				List<Conference> listeConf = new ArrayList<Conference>();
				try {
			String query2 = "SELECT * FROM conference WHERE id_chercheur = ?;";
			PreparedStatement pt2 =connection.prepareStatement(query2);
			pt2.setInt(1,id);
			ResultSet rs = pt2.executeQuery();
			
			while(rs.next()) {
				Conference p = new Conference();
				p.setId_conference(rs.getInt("id_conference"));
				p.setType_conference(rs.getString("type_conference"));
				p.setIntitule_conference(rs.getString("intitule_conference"));
				p.setLieu_conference(rs.getString("lieu_conference"));
				
				
				p.setDate_conference(rs.getDate("date_conference"));
				p.setPdfConf(rs.getBytes("pdfConf"));
				listeConf.add(p);
				System.out.println("c fait ");
							}
			
			
					}catch(Exception e) {
			e.printStackTrace();
			}
				return listeConf;
				
			
		}
	//*********************************delete conf********************************
	public static void deleteConference(int id) {
		try {
			String query4 ="DELETE FROM conference WHERE id_conference = ?"; 
			PreparedStatement ps= connection.prepareStatement(query4);
			ps.setInt(1,id);
			ps.executeUpdate();
			ps.close();
			System.out.println("c fait");
		}
		catch (SQLException e) {
			 e.printStackTrace();
		}
	
}
}
