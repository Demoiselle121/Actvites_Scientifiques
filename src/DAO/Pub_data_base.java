package DAO;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import metier.entites.Publication;



public class Pub_data_base {
	static Connection connection;
	
	public Pub_data_base(Connection connection ) {
		Pub_data_base.connection = connection;
	}
	//**********************savePub*****************************************************
	
	public static boolean savePub(Publication pub){
		boolean set= false;
		try {
	
		String query1 = "insert into publication(titre_pub,abstract_pub,justificatif_pub,type_publication,id_chercheur,date_publication,pdfPub,d) values(?,?,?,?,?,?,?,?);";
		PreparedStatement pt1 = (PreparedStatement) connection.prepareStatement(query1);
		pt1.setString(1, pub.getTitre_pub());
		pt1.setString(2 , pub.getAbstract_pub());
		
		pt1.setBytes(3, pub.getJustificatif_pub());
		
		pt1.setString(4, pub.getType_publication());
		pt1.setInt(5, pub.getId_chercheur());
		pt1.setDate(6, pub.getDate_publication());
		pt1.setBytes(7, pub.getPdfPub());
		pt1.setString(8, pub.getD());
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
	//************************public List<Publication> PublicationParMc(String mc)*******************************
	
	public static List<Publication> PublicationParMc(String mc){
		List<Publication> listePub = new ArrayList<Publication>();
		try {
	String query2 = "SELECT * FROM publication WHERE titre_pub LIKE ?;";
	PreparedStatement pt2 =connection.prepareStatement(query2);
	pt2.setString(1,"%"+mc+"%");
	ResultSet rs = pt2.executeQuery();
	
	while(rs.next()) {
		Publication p = new Publication();
		p.setTitre_pub(rs.getString("titre_pub"));
		p.setAbstract_pub(rs.getString("abstract_pub"));
		p.setJustificatif_pub(rs.getBytes("Justificatif_pub"));
		p.setType_publication(rs.getString("type_publication"));
		p.setId_chercheur(rs.getInt("id_chercheur"));
		p.setDate_publication(rs.getDate("date_publication"));
		p.setPdfPub(rs.getBytes("pdfPub"));
		p.setD(rs.getString("d"));
		listePub.add(p);
		System.out.println("c fait ");
					}
	
	
			}catch(Exception e) {
	e.printStackTrace();
	}
		return listePub;
		
	
}
	//************************public List<Publication> PubParIdChercheur(String mc)*******************************
	
		public static List<Publication> pubParIdChercheur(int id){
			List<Publication> listePub = new ArrayList<Publication>();
			try {
		String query2 = "SELECT * FROM publication WHERE id_chercheur = ?;";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		pt2.setInt(1,id);
		ResultSet rs = pt2.executeQuery();
		
		while(rs.next()) {
			Publication p = new Publication();
			p.setId_pub(rs.getInt("id_pub"));
			p.setTitre_pub(rs.getString("titre_pub"));
			p.setAbstract_pub(rs.getString("abstract_pub"));
			p.setJustificatif_pub(rs.getBytes("Justificatif_pub"));
			p.setType_publication(rs.getString("type_publication"));
			p.setId_chercheur(rs.getInt("id_chercheur"));
			p.setDate_publication(rs.getDate("date_publication"));
			p.setPdfPub(rs.getBytes("pdfPub"));
			p.setD(rs.getString("d"));
			listePub.add(p);
			System.out.println("c fait ");
						}
		
		
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listePub;
			
		
	}
		
		//************************public List<Publication> PubParIdChercheur(String mc)*******************************
		
			public List<Publication> pubParDate(String d){
				List<Publication> listePub = new ArrayList<Publication>();
				try {
			String query2 = "SELECT * FROM publication WHERE d = ?";
			PreparedStatement pt2 =connection.prepareStatement(query2);
			pt2.setString(1,d);
			ResultSet rs = pt2.executeQuery();
			
			while(rs.next()) {
				Publication p = new Publication();
				p.setId_pub(rs.getInt("id_pub"));
				p.setTitre_pub(rs.getString("titre_pub"));
				p.setAbstract_pub(rs.getString("abstract_pub"));
				p.setJustificatif_pub(rs.getBytes("Justificatif_pub"));
				p.setType_publication(rs.getString("type_publication"));
				p.setId_chercheur(rs.getInt("id_chercheur"));
				p.setPdfPub(rs.getBytes("pdfPub"));
				p.setDate_publication(rs.getDate("date_publication"));
				p.setD(rs.getString("d"));
				listePub.add(p);
							}
			
			
					}catch(Exception e) {
			e.printStackTrace();
			}
				return listePub;
				
			
		}
		
			
			public List<Publication> listAllPubMc(String mc) {
				// TODO Auto-generated method stub
				List<Publication> listPub=new ArrayList<Publication>();
				try {
					
					PreparedStatement ps= connection.prepareStatement("select * from publication where d LIKE ? or titre_pub LIKE ?");
					ps.setString(1, "%"+mc+"%");
					ps.setString(2, "%"+mc+"%");
					
					ResultSet rs = ps.executeQuery();
					System.out.println(rs);
					while (rs.next()) {
											Publication ac = new Publication();
						ac.setId_pub(rs.getInt("id_pub"));
						ac.setTitre_pub(rs.getString("titre_pub"));
						ac.setAbstract_pub(rs.getString("abstract_pub"));
						ac.setType_publication(rs.getString("type_publication"));
						ac.setAbstract_pub(rs.getString("abstract_pub"));	
						ac.setDate_publication(rs.getDate("date_publication"));
						ac.setD(rs.getString("d"));
						listPub.add(ac);	
						
					}
				}
				catch(SQLException e){
					e.printStackTrace();
				}
				return listPub;
				
			}
//////////////////////////////////////justifiacti_pub(id)/////////////////////////////////
		public static byte[] getJustifiactif_Pub_pub(int id_pub){
			byte[] justif = null ;
			try {	
				String query2 = "SELECT justificatif_pub from publication WHERE id_pub=? ";
				PreparedStatement ps =connection.prepareStatement(query2);
				
				ps.setInt(1,id_pub);
				
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
						
					
					justif = rs.getBytes("justificatif_pub");	
				

					
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return justif;
			
		
	}
		
//////////////////////////////////////justifiacti_pub(id)/////////////////////////////////
public static byte[] getPub(int id_pub){
byte[] justif = null ;
try {	
String query2 = "SELECT pdfPub from publication WHERE id_pub=? ";
PreparedStatement ps =connection.prepareStatement(query2);

ps.setInt(1,id_pub);

ResultSet rs=ps.executeQuery();
if(rs.next()) {



justif = rs.getBytes("pdfPub");	


}

} catch (Exception e) {

e.printStackTrace();
}
return justif;


}
	//********************************afficher par mc type ***********************
		public List<String> PubParType(){
			List<String> listePubParType = new ArrayList<String>();
			try {
		String query2 = "SELECT * FROM publication";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		
		ResultSet rs = pt2.executeQuery();
		String PubType = null;
		while(rs.next()) {
			PubType =  rs.getString("type_publication");
			listePubParType.add(PubType);
			System.out.println("c fait ");
						}
		
		
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listePubParType;
			
		
	}
	//************************public List<Publication> PublicationPaTyoe(String mc)*******************************
	
		public List<Publication> PublicationParTyoe(String mc){
			List<Publication> listePub = new ArrayList<Publication>();
			try {
		String query2 = "SELECT * FROM publication WHERE type_publication LIKE ?;";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		pt2.setString(1,"%"+mc+"%");
		ResultSet rs = pt2.executeQuery();
		
		while(rs.next()) {
			Publication p = new Publication();
			p.setTitre_pub(rs.getString("titre_pub"));
			p.setAbstract_pub(rs.getString("abstract_pub"));
			p.setType_publication(rs.getString("type_publication"));
			p.setId_chercheur(rs.getInt("id_chercheur"));
			p.setDate_publication(rs.getDate("date_publication"));
			p.setJustificatif_pub(rs.getBytes("Justificatif_pub"));
			p.setPdfPub(rs.getBytes("pdfPub"));
			p.setD(rs.getString("d"));
			listePub.add(p);
			System.out.println("c fait ");
						}
		
		
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listePub;
			
		
	}
		//***********************les pub****************************
		public static List<Publication> LesPublications(){
			List<Publication> listePubs= new ArrayList<Publication>();
			try {
		String query2 = "SELECT * FROM publication ";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		ResultSet rs = pt2.executeQuery();
		
		while(rs.next()) {
			Publication p = new Publication();
			p.setId_pub(rs.getInt("id_pub"));
			p.setTitre_pub(rs.getString("titre_pub"));
			p.setAbstract_pub(rs.getString("abstract_pub"));
			p.setJustificatif_pub(rs.getBytes("Justificatif_pub"));
			p.setType_publication(rs.getString("type_publication"));
			p.setId_chercheur(rs.getInt("id_chercheur"));
			p.setDate_publication(rs.getDate("date_publication"));
			p.setPdfPub(rs.getBytes("pdfPub"));
			p.setD(rs.getString("d"));
			listePubs.add(p);
			System.out.println("c fait ");
						}
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listePubs;
			
		
	}
		
		//********************************set id chercheur = null*******************
  		public static void updatePubChercheur( int id )
		{
			try {
				String query3 = "update publication set id_chercheur =null  where id_publication =?";
				PreparedStatement pt3 = connection.prepareStatement(query3);
				
				
				pt3.setInt(1,id);
				pt3.executeUpdate();
				System.out.println("c fait");
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	//***************************update Publication **************************************************
	public Publication updatePublication(Publication pub,int id )
	{
		try {
			String query3 = "update publication set titre_pub =? ,abstract_pub =?,type_publication =?,id_chercheur=?,date_publication=?, pdfPub = ?,justificatif_pub=?, d=? where id_pub =?";
			PreparedStatement pt3 = connection.prepareStatement(query3);
			
			pt3.setString(1, pub.getTitre_pub());
			pt3.setString(2, pub.getAbstract_pub());
			pt3.setString(3, pub.getType_publication());
			pt3.setInt(4, pub.getId_chercheur());
			pt3.setDate(5, pub.getDate_publication());
			pt3.setBytes(6,pub.getPdfPub());
			pt3.setBytes(7,pub.getJustificatif_pub());
			pt3.setString(8, pub.getD());
			pt3.setInt(9,id);
			pt3.executeUpdate();
			System.out.println("c fait");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return pub;
	}
	//***********************************delete pub******************************************************
	public static void deletePublication(int id) {
	try {
		String query4 ="DELETE FROM publication WHERE id_pub = ?"; 
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

