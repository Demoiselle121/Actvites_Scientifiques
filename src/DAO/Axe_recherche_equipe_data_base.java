
  package DAO;
  
  import java.sql.Connection;
import java.sql.PreparedStatement;

import metier.entites.Axe_recherche_equipe;
  
  public class Axe_recherche_equipe_data_base {
  
  static Connection connection;
  
  public Axe_recherche_equipe_data_base(Connection connection ) {
	  Axe_recherche_equipe_data_base.connection = connection; }
  //**********************saveAxeREquipe***************************************

  
  public static boolean saveAxe_recherche_equipe(Axe_recherche_equipe axeRE,int id_equipe,int id_axe){
	  boolean set= false; 
	  try {
  
  String query1 ="SELECT distinct nom_axe FROM activscientifiques.axe_recherche ax ,activscientifiques.axe_recherche_equipe ae, activscientifiques.equipe e where e.id_equipe = ae.id_equipe and ax.id_axe = ae.id_axe and e.id_equipe =?";
  PreparedStatement pt1 = connection.prepareStatement(query1); 
  pt1.setInt(1, axeRE.getId_axe());
  pt1.setInt(2, axeRE.getid_equipe());
  pt1.executeUpdate(); set = true; System.out.println("c fait ");
  }
	  catch(Exception e) { e.printStackTrace(); } 
	  return set ; }
  }
  
/*
 * //************************public List<axe_recherche_labo>
 * Axe_recherche_laboParMC(String mc)*******************************
 * 
 * public List<Axe_recherche> Axe_rechercheParMC(String mc){ List<Axe_recherche>
 * listeAxeRecherche = new ArrayList<Axe_recherche>(); try { String query2
 * ="SELECT * FROM axe_recherche WHERE nom_axe LIKE ?;"; PreparedStatement
 * pt2=connection.prepareStatement(query2); pt2.setString(1,"%"+mc+"%");
 * ResultSet rs = pt2.executeQuery();
 * 
 * while(rs.next()) { Axe_recherche axerecherche= new Axe_recherche();
 * axerecherche.setId_axe(rs.getInt("id_axe"));
 * axerecherche.setNom_axe(rs.getString("nom_axe"));
 * 
 * listeAxeRecherche.add(axerecherche); System.out.println("c fait "); }
 * 
 * 
 * }catch(Exception e) { e.printStackTrace(); } return listeAxeRecherche;
 * 
 * 
 * }
 * 
 * //*********************Axe recherche Par Nom******************************
 * 
 * public static Axe_recherche getAxeRParId(int id){ Axe_recherche c = new
 * Axe_recherche(); try { String query2 =
 * "SELECT nom_axe from axe_recherche WHERE id_axe=? "; PreparedStatement ps
 * =connection.prepareStatement(query2);
 * 
 * 
 * ps.setInt(1, id); ResultSet rs=ps.executeQuery(); if(rs.next()) {
 * c.setId_axe(id); c.setNom_axe(rs.getString("nom_axe")); } } catch (Exception
 * e) {
 * 
 * e.printStackTrace(); }
 * 
 * return c; } //*******************************liste des axes de recherche
 ******************************** public List<Axe_recherche> ListeAxeRecherche(){ List<Axe_recherche>
 * listeAxeRecherche = new ArrayList<Axe_recherche>(); try { String query2
 * ="SELECT * FROM axe_recherche "; PreparedStatement pt2
 * =connection.prepareStatement(query2); ResultSet rs = pt2.executeQuery();
 * 
 * while(rs.next()) { Axe_recherche p = new Axe_recherche();
 * p.setId_axe(rs.getInt("id_axe")); p.setNom_axe(rs.getString("nom_axe"));
 * listeAxeRecherche.add(p); System.out.println("c fait "); } }catch(Exception
 * e) { e.printStackTrace(); } return listeAxeRecherche; }
 * 
 * //***************************update Axe_recherche_labo public static
 * Axe_recherche updateAxe_recherche(Axe_recherche axe,int id ) { try { String
 * query3 = "update axe_recherche set nom_axe =? where id_axe=? ";
 * PreparedStatement pt3 = connection.prepareStatement(query3);
 * 
 * pt3.setString(1, axe.getNom_axe());
 * 
 * pt3.setInt(2,id); pt3.executeUpdate(); System.out.println("c fait");
 * }catch(Exception e) { e.printStackTrace(); } return axe; }
 * //***********************************delete Axe_recherche_labo public static
 * void deleteAxe_recherche (int id) { try { String query4
 * ="DELETE FROM axe_recherche WHERE id_axe = ?"; PreparedStatement ps=
 * connection.prepareStatement(query4); ps.setInt(1,id); ps.executeUpdate();
 * ps.close(); System.out.println("c fait"); } catch (SQLException e) {
 * e.printStackTrace(); } } }
 * 
 * }
 */