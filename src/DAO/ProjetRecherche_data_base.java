package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entites.Conference;
import metier.entites.ProjetRecherche;
import metier.entites.Publication;


public class ProjetRecherche_data_base {
	static Connection connection ;
	
	public ProjetRecherche_data_base(Connection connection) {
		ProjetRecherche_data_base.connection = connection;
	}
	//***********************saveProject*******************
	public static boolean saveProjetRecherche(ProjetRecherche prj) {
		boolean set = false;
		try {
			String query1 = "insert into projet_recherche(titre_projet_recherch,description_projet_recherche,budget_projet_recherche,justificatif_projet_recherche,id_chercheur,pdfProjet) values (?,?,?,?,?,?)";
			PreparedStatement pt1 = connection.prepareStatement(query1);
			pt1.setString(1, prj.getTitre_projet_recherch());
			pt1.setString(2, prj.getDescription_projet_recherche());
			pt1.setDouble(3, prj.getBudget_projet_recherche());
			//Blob b1 = connection.createBlob();
			//b1.setBytes(1, new byte[10]);
			pt1.setBytes(4, prj.getJustificatif_projet_recherche());
			pt1.setInt(5, prj.getId_chercheur());
			pt1.setBytes(6, prj.getPdfProjet());
			
			pt1.executeUpdate();
			set = true;
			System.out.println("c fait");
			}catch(Exception e){
	            e.printStackTrace();
	        }
		return set ;
	}

	//***************************************liste des ProjetDrecherches **************************************
	 public static List<ProjetRecherche> ListeDProjetDRecherche(){
			List<ProjetRecherche> ListeDRecherche = new ArrayList<ProjetRecherche>();
			try {
		String query = "SELECT * FROM projet_recherche ";
		PreparedStatement pt =connection.prepareStatement(query);
		ResultSet r = pt.executeQuery();
		
		while(r.next()) {
			ProjetRecherche p = new ProjetRecherche();
			p.setId_projet_recherche(r.getInt("id_projet_recherche"));
			p.setTitre_projet_recherch(r.getString("Titre_projet_recherch"));
			p.setBudget_projet_recherche(r.getDouble("Budget_projet_recherche"));
			p.setJustificatif_projet_recherche(r.getBytes("justificatif_projet_recherche"));
			p.setId_chercheur(r.getInt("id_chercheur"));
			p.setPdfProjet(r.getBytes("pdfProjet"));

			ListeDRecherche.add(p);
			System.out.println("c fait ");
						}
				}catch(Exception e) {
		e.printStackTrace() ;
		}
			return ListeDRecherche;
			
		
	}
	 
//////////////////////////////////////justifiacti_pub(id)/////////////////////////////////
public static byte[] getJustificatif_Projet_prj(int id_prj){
byte[] justif = null ;
try {	
String query2 = "SELECT justificatif_projet_recherche from projet_recherche WHERE id_projet_recherche=? ";
PreparedStatement ps =connection.prepareStatement(query2);

ps.setInt(1,id_prj);

ResultSet rs=ps.executeQuery();
if(rs.next()) {


justif = rs.getBytes("justificatif_projet_recherche");	


}

} catch (Exception e) {

e.printStackTrace();
}
return justif;


}

//////////////////////////////////////justifiacti_pub(id)/////////////////////////////////
public static byte[] getProjet(int id_prj){
byte[] justif = null ;
try {	
String query2 = "SELECT pdfProjet from projet_recherche WHERE id_projet_recherche=? ";
PreparedStatement ps =connection.prepareStatement(query2);

ps.setInt(1,id_prj);

ResultSet rs=ps.executeQuery();
if(rs.next()) {


justif = rs.getBytes("pdfProjet");	


}

} catch (Exception e) {

e.printStackTrace();
}
return justif;


}


	 
	//***********************les Projets****************************
			public List<ProjetRecherche> LesProjet(){
				List<ProjetRecherche> listePrjs= new ArrayList<ProjetRecherche>();
				try {
			String query2 = "SELECT * FROM projet_recherche ";
			PreparedStatement pt2 =connection.prepareStatement(query2);
			ResultSet rs = pt2.executeQuery();
			
			while(rs.next()) {
				ProjetRecherche p = new ProjetRecherche();
				p.setId_projet_recherche(rs.getInt("id_projet_recherche"));
				p.setTitre_projet_recherch(rs.getString("titre_projet_recherch"));
				p.setDescription_projet_recherche(rs.getString("description_projet_recherche"));
				p.setBudget_projet_recherche(rs.getDouble("budget_projet_recherche"));
				p.setJustificatif_projet_recherche(rs.getBytes("justificatif_projet_recherche"));
				p.setId_chercheur(rs.getInt("id_chercheur"));
				p.setPdfProjet(rs.getBytes("pdfProjet"));

				listePrjs.add(p);
				System.out.println("c fait ");
							}
					}catch(Exception e) {
			e.printStackTrace();
			}
				return listePrjs;
				
			
		}
	//**************************Afficher liste de Projets**********************
	
	
	public List<ProjetRecherche> listeProduits(){
		List<ProjetRecherche> prj =new ArrayList <ProjetRecherche>();
		Connection conn =  SingletonConnection.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("select * from projet_recherche  ");
			ResultSet rs = ps.executeQuery();//maping obj relationnel.
			while(rs.next()) {
				ProjetRecherche p = new ProjetRecherche();
				
				p.setTitre_projet_recherch(rs.getString("titre_projet_recherch"));
				p.setDescription_projet_recherche(rs.getString("description_projet_recherche"));
				p.setBudget_projet_recherche(rs.getDouble("budget_projet_recherche"));
				p.setJustificatif_projet_recherche(rs.getBytes("justificatif_projet_recherche"));
				p.setId_chercheur(rs.getInt("id_chercheur"));
				p.setPdfProjet(rs.getBytes("pdfProjet"));

				//ajouter le prj a la liste 
				prj.add(p);
				System.out.println("c fait");
			}
				ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return prj;
	}
	
	
	
	//********************************Afficher projet par mc******************************
	
	
	public List<ProjetRecherche> ProjetRechercheParMc(String mc){
		List<ProjetRecherche> listePrj = new ArrayList<ProjetRecherche>();
		try {
	String query2 = "SELECT * FROM projet_recherche WHERE titre_projet_recherch LIKE ?;";
	PreparedStatement pt2 =connection.prepareStatement(query2);
	pt2.setString(1,"%"+mc+"%");
	ResultSet rs = pt2.executeQuery();
	
	while(rs.next()) {
		ProjetRecherche prj = new ProjetRecherche();
		prj.setDescription_projet_recherche(rs.getString("description_projet_recherche"));
		prj.setBudget_projet_recherche(rs.getDouble("budget_projet_recherche"));
		prj.setJustificatif_projet_recherche(rs.getBytes("justificatif_projet_recherche"));
		prj.setId_chercheur(rs.getInt("id_chercheur"));
		prj.setPdfProjet(rs.getBytes("pdfProjet"));

		listePrj.add(prj);
		System.out.println("c fait ");
					}
			}catch(Exception e) {
	e.printStackTrace();
	}
		return listePrj;
	}
	//*************************************update projet de recherche*********************
	public static void updateProjetRecherche(ProjetRecherche p,int  id)
	{
		try {
			String query3 = "update projet_recherche set titre_projet_recherch=?,description_projet_recherche=?,budget_projet_recherche=?,justificatif_projet_recherche=?, id_chercheur = ?, pdfProjet =?  where id_projet_recherche=?";
			PreparedStatement pt3 = connection.prepareStatement(query3);
			
			pt3.setString(1,p.getTitre_projet_recherch());
			pt3.setString(2,p.getDescription_projet_recherche());
			pt3.setDouble(3,p.getBudget_projet_recherche());
			pt3.setBytes(4,p.getJustificatif_projet_recherche());
			pt3.setInt(5,p.getId_chercheur());
			pt3.setString(6,p.getTitre_projet_recherch());
			pt3.setBytes(7,p.getPdfProjet());

			pt3.setInt(8,id);
			
			pt3.executeUpdate();
			System.out.println("c fait");
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
	//*************************************delete projet de recherche*********************
	
	public static void deleteProjetRecherche(int id) {
		try {
			String query4 ="DELETE FROM projet_recherche WHERE id_projet_recherche = ?"; 
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
