package DAO;


import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entites.Axe_recherche;
import metier.entites.Equipe;
import metier.entites.chercheur_Model;


public class Axe_recherche_data_base {
static Connection connection;
	
	public Axe_recherche_data_base(Connection connection ) {
		Axe_recherche_data_base.connection = connection;
	}
	//**********************saveAxe*****************************************************
	
	public boolean saveAxe_recherche(Axe_recherche axe){
		boolean set= false;
		try {
	
		String query1 = "insert into axe_recherche (nom_axe) values(?);";
		PreparedStatement pt1 = connection.prepareStatement(query1);
		pt1.setString(1, axe.getNom_axe());
		
		
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
	//************************public List<axe_recherche_labo> Axe_recherche_laboParMC(String mc)*******************************
	
		public List<Axe_recherche> Axe_rechercheParMC(String mc){
			List<Axe_recherche> listeAxeRecherche = new ArrayList<Axe_recherche>();
			try {
		String query2 = "SELECT * FROM axe_recherche WHERE nom_axe LIKE ?;";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		pt2.setString(1,"%"+mc+"%");
		ResultSet rs = pt2.executeQuery();
		
		while(rs.next()) {
			Axe_recherche axerecherche= new Axe_recherche();
			axerecherche.setId_axe(rs.getInt("id_axe"));
			axerecherche.setNom_axe(rs.getString("nom_axe"));
			
			listeAxeRecherche.add(axerecherche);
			System.out.println("c fait ");
						}
		
		
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listeAxeRecherche;
			
		
	}
		
		//*********************Axe recherche  Par Nom******************************
		 
	    public static Axe_recherche getAxeRParId(int id){
	    	Axe_recherche c = new Axe_recherche();
			try {
				String query2 = "SELECT nom_axe from axe_recherche WHERE id_axe=? ";
				PreparedStatement ps =connection.prepareStatement(query2);
				
				
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					c.setId_axe(id);
					c.setNom_axe(rs.getString("nom_axe"));	
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return c;
		}
	    
	  //*********************Axe recherche  Par Nom******************************
		
			
			public static List<Axe_recherche> ListeAxeParEquipe(int id_equipe) {
				List<Axe_recherche> listeAxe = new ArrayList<Axe_recherche>();
				try {
					String query2 = "SELECT distinct ax.id_axe,nom_axe FROM activscientifiques.axe_recherche ax ,activscientifiques.axe_recherche_equipe ae, activscientifiques.equipe e where e.id_equipe = ae.id_equipe and ax.id_axe = ae.id_axe and e.id_equipe =?";
					PreparedStatement pt2 = connection.prepareStatement(query2);
					pt2.setInt(1, id_equipe);
					
					ResultSet rs = pt2.executeQuery();

					while (rs.next()) {
						Axe_recherche p = new Axe_recherche();
						
						p.setId_axe(rs.getInt("id_axe"));
						p.setNom_axe(rs.getString("nom_axe"));

						listeAxe.add(p);
						
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return listeAxe;

			}

			
			public static void SetnullAxe(int id_axe,int id_equipe) {
				try {
					PreparedStatement ps = connection
							.prepareStatement("DELETE FROM activscientifiques.axe_recherche_equipe  WHERE id_axe=? and id_equipe =?");
					ps.setInt(1, id_axe);
					ps.setInt(2, id_equipe);
					ps.executeUpdate();
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}


	    
	  //********************************Liste des Id Axes***********************
		public List<Integer> ListeIdAxe(){
			List<Integer> ListeId = new ArrayList<Integer>();
			try {
		String query2 = "SELECT id_axe FROM axe_recherche";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		
		ResultSet rs = pt2.executeQuery();
		int id_axe = 0;
		while(rs.next()) {
			
			
			id_axe=rs.getInt("id_axe");
			
			ListeId.add(id_axe);
			System.out.println("c fait ");
						}
		
		
				}catch(Exception e) {
		e.printStackTrace();
		}
			return ListeId;
			
		
	}
		 //*********************getEgetAxequipe******************************
		 
	    public static Axe_recherche getAxeParId(int id) {
	    	Axe_recherche c = new Axe_recherche();
			try {
				String query2 = "SELECT * from axe WHERE id_axe=? ";
				PreparedStatement ps =connection.prepareStatement(query2);
				
				
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					c.setId_axe(id);
					c.setNom_axe(rs.getString("nom_axe"));
					
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return c;
		}
	    
		
	    //*******************************liste des axes de recherche ********************************
	    public List<Axe_recherche> ListeAxeRecherche(){
	    	  List<Axe_recherche> listeAxeRecherche = new ArrayList<Axe_recherche>(); 
	    	  try { 
	    		  String query2 ="SELECT * FROM axe_recherche ";
	    	  PreparedStatement pt2 =connection.prepareStatement(query2); 
	    	  ResultSet rs = pt2.executeQuery();
	    	  
	    	  while(rs.next()) { 
	    		  Axe_recherche p = new Axe_recherche();
	    		  p.setId_axe(rs.getInt("id_axe"));
	    		  p.setNom_axe(rs.getString("nom_axe"));
	    		  listeAxeRecherche.add(p); System.out.println("c fait "); 
	    		  }
	    	  }catch(Exception e) { 
	    		  e.printStackTrace(); 
	    		  } 
	    	  return listeAxeRecherche;
	    	  }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    public static List<Axe_recherche> NomAxe(){
			List<Axe_recherche> listeAxe = new ArrayList<Axe_recherche>();
			try {
		String query2 = "SELECT id_axe,nom_axe from axe_recherche";
		PreparedStatement pt2 =connection.prepareStatement(query2);
	
		ResultSet rs = pt2.executeQuery();
		
		while(rs.next()) {
			Axe_recherche p = new Axe_recherche();
			p.setId_axe(rs.getInt("id_axe"));
			
			p.setNom_axe(rs.getString("nom_axe"));	
			
			listeAxe.add(p);
						}
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listeAxe;
		
	}
	    
	    

	    public static void updateAxeEquipe( int ida,int ide)
		{
	    	boolean set= false;
			try {
				String query3 = "insert into  axe_recherche_equipe (id_axe,id_equipe) values(?,?);";
				PreparedStatement pt3 = connection.prepareStatement(query3);
				
				pt3.setInt(1,ida);
				pt3.setInt(2,ide);
				
				
				pt3.executeUpdate();
				set = true;
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		//***************************update Axe_recherche_labo **************************************************
		public static Axe_recherche updateAxe_recherche(Axe_recherche axe,int id )
		{
			try {
				String query3 = "update axe_recherche set nom_axe =? where id_axe=? ";
				PreparedStatement pt3 = connection.prepareStatement(query3);
				
				pt3.setString(1, axe.getNom_axe());
			
				pt3.setInt(2,id);
				pt3.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return axe;
		}
		//***********************************delete Axe_recherche_labo ******************************************************
		public static void deleteAxe_recherche (int id) {
		try {
			String query4 ="DELETE FROM axe_recherche WHERE id_axe = ?"; 
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
