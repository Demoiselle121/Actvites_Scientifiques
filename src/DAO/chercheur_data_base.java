package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import metier.entites.chercheur_Model;
import metier.entites.login;

public class chercheur_data_base {
	static Connection connection;

	public chercheur_data_base(Connection connection) {
		chercheur_data_base.connection = connection;
	}

	// ******************************saveUser**************************
	/*
	 * public boolean saveUser(chercheur_Model chercheur){ boolean set = false; try{
	 * 
	 * 
	 * String query1 =
	 * "insert into chercheur(nom_chercheur,prenom_chercheur,email_chercheur,tel_chercheur,type_chercheur,photo_chercheur,responsablite_chercheur,responsabilite_pedagogique_chercheur,mdp,id_equipe,id_labo) values(?,?,?,?,?,?,?,?,?,?,?)"
	 * ; PreparedStatement pt1 =connection.prepareStatement(query1);
	 * 
	 * pt1.setString(1, chercheur.getNom_chercheur()); pt1.setString(2,
	 * chercheur.getPrenom_chercheur()); pt1.setString(3,
	 * chercheur.getEmail_chercheur()); pt1.setInt(4, chercheur.getTel_chercheur());
	 * pt1.setString(5, chercheur.getType_chercheur()); pt1.setBytes(6,
	 * chercheur.getPhoto_chercheur()); pt1.setString(7,
	 * chercheur.getResponsablite_chercheur()); pt1.setString(8,
	 * chercheur.getResponsabilite_pedagogique_chercheur());
	 * 
	 * pt1.setString(9, chercheur.getMdp()); pt1.setInt(10,
	 * chercheur.getId_equipe()); pt1.setInt(11, chercheur.getId_labo());
	 * 
	 * 
	 * 
	 * //***********************************
	 * 
	 * 
	 * login user = new login (); String query2 =
	 * "insert into login(username,password) values(?,?)"; PreparedStatement pt2
	 * =connection.prepareStatement(query2);
	 * 
	 * user.setUsername(chercheur.getNom_chercheur());
	 * user.setPassword(chercheur.getMdp());
	 * 
	 * 
	 * pt2.setString(1, user.getUsername()); pt2.setString(2, user.getPassword());
	 * 
	 * 
	 * pt1.executeUpdate(); // pt2.executeUpdate(); set = true;
	 * 
	 * }catch(Exception e){ e.printStackTrace(); } return set; }
	 */

	public boolean saveUser1(chercheur_Model chercheur) {
		boolean set = false;
		try {

			String query1 = "insert into chercheur(nom_chercheur,prenom_chercheur,email_chercheur,tel_chercheur,type_chercheur,photo_chercheur,responsablite_chercheur,responsabilite_pedagogique_chercheur,mdp) values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pt1 = connection.prepareStatement(query1);

			pt1.setString(1, chercheur.getNom_chercheur());
			pt1.setString(2, chercheur.getPrenom_chercheur());
			pt1.setString(3, chercheur.getEmail_chercheur());
			pt1.setInt(4, chercheur.getTel_chercheur());
			pt1.setString(5, chercheur.getType_chercheur());
			pt1.setBytes(6, chercheur.getPhoto_chercheur());
			pt1.setString(7, chercheur.getResponsablite_chercheur());
			pt1.setString(8, chercheur.getResponsabilite_pedagogique_chercheur());

			pt1.setString(9, chercheur.getMdp());

			// ***********************************

			/*
			 * login user = new login (); String query2 =
			 * "insert into login(username,password) values(?,?)"; PreparedStatement pt2
			 * =connection.prepareStatement(query2);
			 * 
			 * user.setUsername(chercheur.getNom_chercheur());
			 * user.setPassword(chercheur.getMdp());
			 * 
			 * 
			 * pt2.setString(1, user.getUsername()); pt2.setString(2, user.getPassword());
			 */

			pt1.executeUpdate();
			// pt2.executeUpdate();
			set = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return set;
	}

	static void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
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

	// ******************************getChercheur(type)**************************
	public List<chercheur_Model> ChercheurPrpf() {
		List<chercheur_Model> listeProf = new ArrayList<chercheur_Model>();
		try {
			String query2 = "SELECT * FROM chercheur WHERE type_chercheur='Professeur'";
			PreparedStatement pt2 = connection.prepareStatement(query2);
			ResultSet rs = pt2.executeQuery();

			while (rs.next()) {
				chercheur_Model p = new chercheur_Model();
				p.setId_chercheur(rs.getInt("id_chercheur"));
				p.setNom_chercheur(rs.getString("nom_chercheur"));
				p.setPrenom_chercheur(rs.getString("prenom_chercheur"));
				p.setEmail_chercheur(rs.getString("Email_chercheur"));
				p.setTel_chercheur(rs.getInt("tel_chercheur"));
				p.setType_chercheur(rs.getString("type_chercheur"));
				p.setPhoto_chercheur(rs.getBytes("photo_chercheur"));
				p.setResponsablite_chercheur(rs.getString("responsablite_chercheur"));
				p.setResponsabilite_pedagogique_chercheur(rs.getString("Responsabilite_pedagogique_chercheur"));

				p.setMdp(rs.getString("mdp"));
				p.setId_equipe(rs.getInt("id_equipe"));
				p.setId_labo(rs.getInt("id_labo"));

				listeProf.add(p);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listeProf;

	}

	// ******************************************************************************
	public static void addChercheurEquipe(int id_equipe, int id_chercheur) {
		// TODO Auto-generated method stub
		try {
			String query2 = "UPDATE chercheur SET id_equipe=? WHERE id_chercheur=?";
			PreparedStatement pt2 = connection.prepareStatement(query2);
			pt2.setInt(1, id_equipe);
			pt2.setInt(2, id_chercheur);
			pt2.executeUpdate();
			pt2.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ============================================porf/docteur=================
	public List<chercheur_Model> ChercheurProf_doc() {
		List<chercheur_Model> listeProfDoc = new ArrayList<chercheur_Model>();
		try {
			String query2 = "SELECT * FROM chercheur WHERE type_chercheur='Professeur' or type_chercheur='Docteur'";
			PreparedStatement pt2 = connection.prepareStatement(query2);
			ResultSet rs = pt2.executeQuery();

			while (rs.next()) {
				chercheur_Model p = new chercheur_Model();
				p.setId_chercheur(rs.getInt("id_chercheur"));
				p.setNom_chercheur(rs.getString("nom_chercheur"));
				p.setPrenom_chercheur(rs.getString("prenom_chercheur"));
				p.setEmail_chercheur(rs.getString("Email_chercheur"));
				p.setTel_chercheur(rs.getInt("tel_chercheur"));
				p.setType_chercheur(rs.getString("type_chercheur"));
				p.setPhoto_chercheur(rs.getBytes("photo_chercheur"));
				p.setResponsablite_chercheur(rs.getString("responsablite_chercheur"));
				p.setResponsabilite_pedagogique_chercheur(rs.getString("Responsabilite_pedagogique_chercheur"));

				p.setMdp(rs.getString("mdp"));
				p.setId_equipe(rs.getInt("id_equipe"));
				p.setId_labo(rs.getInt("id_labo"));

				listeProfDoc.add(p);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listeProfDoc;

	}

	// ******************************************getTousChercheur()*********************
	public static List<chercheur_Model> LesChercheur() {
		List<chercheur_Model> listeChercheurs = new ArrayList<chercheur_Model>();
		try {
			String query2 = "SELECT * FROM chercheur ";
			PreparedStatement pt2 = connection.prepareStatement(query2);
			ResultSet rs = pt2.executeQuery();

			while (rs.next()) {
				chercheur_Model p = new chercheur_Model();
				p.setId_chercheur(rs.getInt("id_chercheur"));
				p.setNom_chercheur(rs.getString("nom_chercheur"));
				p.setPrenom_chercheur(rs.getString("prenom_chercheur"));
				p.setEmail_chercheur(rs.getString("Email_chercheur"));
				p.setTel_chercheur(rs.getInt("tel_chercheur"));
				p.setType_chercheur(rs.getString("type_chercheur"));
				p.setPhoto_chercheur(rs.getBytes("photo_chercheur"));
				p.setResponsablite_chercheur(rs.getString("responsablite_chercheur"));
				p.setResponsabilite_pedagogique_chercheur(rs.getString("Responsabilite_pedagogique_chercheur"));

				p.setMdp(rs.getString("mdp"));
				p.setId_equipe(rs.getInt("id_equipe"));
				p.setId_labo(rs.getInt("id_labo"));

				listeChercheurs.add(p);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listeChercheurs;

	}
	// ********************************************getChercheruPar
	// ID*****************************************

	public static chercheur_Model getCherchParId(int id) {
		chercheur_Model c = new chercheur_Model();
		try {
			String query2 = "SELECT nom_chercheur,prenom_chercheur,Email_chercheur,tel_chercheur,type_chercheur,photo_chercheur,responsablite_chercheur,Responsabilite_pedagogique_chercheur FROM chercheur WHERE id_chercheur=? ";
			PreparedStatement ps = connection.prepareStatement(query2);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setId_chercheur(id);
				c.setNom_chercheur(rs.getString("nom_chercheur"));
				c.setPrenom_chercheur(rs.getString("prenom_chercheur"));
				c.setEmail_chercheur(rs.getString("Email_chercheur"));
				c.setTel_chercheur(rs.getInt("tel_chercheur"));
				c.setType_chercheur(rs.getString("type_chercheur"));
				c.setPhoto_chercheur(rs.getBytes("photo_chercheur"));
				c.setResponsablite_chercheur(rs.getString("responsablite_chercheur"));
				c.setResponsabilite_pedagogique_chercheur(rs.getString("Responsabilite_pedagogique_chercheur"));

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}

	// *********************Chercheur Par pass******************************

	public static chercheur_Model getIdChercheurParPassAndUser(String nom_chercheur, String mdp) {
		chercheur_Model c = new chercheur_Model();
		try {
			String query2 = "SELECT id_chercheur from chercheur WHERE nom_chercheur=? and mdp=? ";
			PreparedStatement ps = connection.prepareStatement(query2);

			ps.setString(1, nom_chercheur);
			ps.setString(2, mdp);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setMdp(mdp);
				c.setNom_chercheur(nom_chercheur);
				c.setId_chercheur(rs.getInt("id_chercheur"));
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return c;
	}

	// ********************getResponsa chercheur()*******************
	public List<String> Respnsabilte_chercheur() {
		List<String> listeResonCherch = new ArrayList<String>();
		try {
			String query2 = "SELECT * FROM chercheur  ";
			PreparedStatement pt2 = connection.prepareStatement(query2);
			String respon_cher = null;
			ResultSet rs = pt2.executeQuery();

			while (rs.next()) {

				respon_cher = rs.getString("responsablite_chercheur");
				System.out.println("respon_chercheur ! " + respon_cher);
				listeResonCherch.add(respon_cher);
				System.out.println("c fait ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listeResonCherch;

	}

	// ********************chercheur_nom()*******************
	public List<chercheur_Model> chercheurSansEq() {
		List<chercheur_Model> chercheurSansEq = new ArrayList<chercheur_Model>();
		try {
			String query2 = "SELECT * FROM chercheur where id_equipe is null ";
			PreparedStatement pt2 = connection.prepareStatement(query2);
			ResultSet rs = pt2.executeQuery();

			while (rs.next()) {
				chercheur_Model p = new chercheur_Model();
				p.setId_chercheur(rs.getInt("id_chercheur"));
				p.setNom_chercheur(rs.getString("nom_chercheur"));
				p.setPrenom_chercheur(rs.getString("prenom_chercheur"));
				p.setEmail_chercheur(rs.getString("Email_chercheur"));
				p.setTel_chercheur(rs.getInt("tel_chercheur"));
				p.setType_chercheur(rs.getString("type_chercheur"));
				p.setPhoto_chercheur(rs.getBytes("photo_chercheur"));
				p.setResponsablite_chercheur(rs.getString("responsablite_chercheur"));
				p.setResponsabilite_pedagogique_chercheur(rs.getString("Responsabilite_pedagogique_chercheur"));

				p.setMdp(rs.getString("mdp"));
				p.setId_equipe(rs.getInt("id_equipe"));
				p.setId_labo(rs.getInt("id_labo"));

				chercheurSansEq.add(p);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return chercheurSansEq;

	}

	// ******************************type cherch************
	public List<String> type_chercheur() {
		List<String> listeType = new ArrayList<String>();
		try {
			String query2 = "SELECT * FROM chercheur  ";
			PreparedStatement pt2 = connection.prepareStatement(query2);
			String type_chercheur = null;
			ResultSet rs = pt2.executeQuery();

			while (rs.next()) {

				type_chercheur = rs.getString("type_chercheur");
				System.out.println("type_cher ! " + type_chercheur);
				listeType.add(type_chercheur);
				System.out.println("c fait ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listeType;
	}

	// ****************************typechercheur()*********************
	public static String getTypeChercheur() {
		String c = null;
		try {
			String query = "SELECT type_chercheur FROM chercheur ";
			PreparedStatement p = connection.prepareStatement(query);
			ResultSet s = p.executeQuery();
			if (s.next()) {
				c = s.getString("type_chercheur");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return c;
	}

	// ****************************id_equipe()*********************
	public static int getIdEquipe() {
		int c = 0;
		try {
			String query = "SELECT id_equipe from chercheur";
			PreparedStatement p = connection.prepareStatement(query);
			ResultSet s = p.executeQuery();
			if (s.next()) {
				c = s.getInt("id_equipe");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return c;
	}

	// *********************Chercheur Par Nom******************************

	public static chercheur_Model getNomChercheurParId(int id) {
		chercheur_Model c = new chercheur_Model();
		try {
			String query2 = "SELECT nom_chercheur,prenom_chercheur from chercheur WHERE id_chercheur=? ";
			PreparedStatement ps = connection.prepareStatement(query2);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setId_equipe(id);

				c.setNom_chercheur(rs.getString("nom_chercheur"));
				c.setPrenom_chercheur(rs.getString("prenom_chercheur"));

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return c;
	}

	// *********************Equipe Par Id chercheur ******************************

	public static List<chercheur_Model> NomChercheurParIdEquipe(int id) {
		List<chercheur_Model> listeChercheur = new ArrayList<chercheur_Model>();
		try {
			String query2 = "SELECT id_chercheur,nom_chercheur,prenom_chercheur from chercheur WHERE id_equipe = ? ";
			PreparedStatement pt2 = connection.prepareStatement(query2);
			pt2.setInt(1, id);
			ResultSet rs = pt2.executeQuery();

			while (rs.next()) {
				chercheur_Model p = new chercheur_Model();
				p.setId_equipe(id);

				p.setId_chercheur(rs.getInt("id_chercheur"));
				p.setNom_chercheur(rs.getString("nom_chercheur"));
				p.setPrenom_chercheur(rs.getString("prenom_chercheur"));

				listeChercheur.add(p);
				System.out.println("c fait ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listeChercheur;

	}

	// ********************************responsa pedago*****************************

	public List<String> RespnsabiltePedago_chercheur() {
		List<String> listeResonPedagoCherch = new ArrayList<String>();
		try {
			String query2 = "SELECT * FROM chercheur  ";
			PreparedStatement pt2 = connection.prepareStatement(query2);
			String responsabilite_pedagogique_chercheur = null;
			ResultSet rs = pt2.executeQuery();

			while (rs.next()) {

				responsabilite_pedagogique_chercheur = rs.getString("responsabilite_pedagogique_chercheur");
				System.out.println("responsabilite_pedagogique_chercheur ! " + responsabilite_pedagogique_chercheur);
				listeResonPedagoCherch.add(responsabilite_pedagogique_chercheur);
				System.out.println("c fait ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listeResonPedagoCherch;

	}

	// ***************************update Axe_recherche_labo
	// **************************************************
	public static void updateChercheur(chercheur_Model ch, int id_chercheur) {

		try {
			String query3 = "update chercheur set nom_chercheur = ?,prenom_chercheur= ?,email_chercheur=?,tel_chercheur=?,type_chercheur =? ,photo_chercheur = ?,responsablite_chercheur=?,responsabilite_pedagogique_chercheur = ? , id_equipe =? , id_labo = ?  where id_chercheur = ?";
			PreparedStatement pt3 = connection.prepareStatement(query3);

			pt3.setString(1, ch.getNom_chercheur());
			pt3.setString(2, ch.getPrenom_chercheur());
			pt3.setString(3, ch.getEmail_chercheur());
			pt3.setInt(4, ch.getTel_chercheur());
			pt3.setString(5, ch.getType_chercheur());
			pt3.setBytes(6, ch.getPhoto_chercheur());
			pt3.setString(7, ch.getResponsabilite_pedagogique_chercheur());
			pt3.setString(8, ch.getResponsabilite_pedagogique_chercheur());
			// pt3.setString(9, ch.getMdp());
			pt3.setInt(9, ch.getId_equipe());
			pt3.setInt(10, ch.getId_labo());

			pt3.setInt(11, id_chercheur);
			pt3.executeUpdate();
			System.out.println("c fait");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ********************************set id equipe = null*******************
	public static void updateChercheurEquipe(int id, chercheur_Model c) {
		try {
			String query3 = "update chercheur set id_equipe =?  where id_chercheur =?";
			PreparedStatement pt3 = connection.prepareStatement(query3);

			pt3.setInt(1, c.getId_equipe());
			pt3.setInt(2, id);
			pt3.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ***********************************delete Axe_recherche_labo
	// ******************************************************
	public static void deleteChercheur(int id) {
		try {
			String query4 = "DELETE FROM chercheur  WHERE id_chercheur = ?";
			PreparedStatement ps = connection.prepareStatement(query4);
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
			System.out.println("c fait");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void SetnullChercheur(int id) {
		try {
			PreparedStatement ps = connection
					.prepareStatement("UPDATE chercheur SET id_equipe=NULL WHERE id_chercheur=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

/*
 * //************************************************************ public
 * List<Axe_recherche_labo> Axe_recherche_laboParMC(String mc){
 * List<Axe_recherche_labo> listeAxeRechercheLabo = new
 * ArrayList<Axe_recherche_labo>(); try { String query2 =
 * "SELECT * FROM axe_recherche_labo WHERE nom_axe_recherche_labo LIKE ?;";
 * PreparedStatement pt2 =connection.prepareStatement(query2);
 * pt2.setString(1,"%"+mc+"%"); ResultSet rs = pt2.executeQuery();
 * 
 * while(rs.next()) { Axe_recherche_labo axerecherche= new Axe_recherche_labo();
 * axerecherche.setNom_axe_recherche_labo(rs.getString("nom_axe_recherche_labo")
 * );
 * 
 * listeAxeRechercheLabo.add(axerecherche); System.out.println("c fait "); }
 * 
 * 
 * }catch(Exception e) { e.printStackTrace(); } return listeAxeRechercheLabo;
 * 
 * 
 * }
 */
