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

public class Equipe_data_base {
static Connection connection;
	
	public Equipe_data_base(Connection connection ) {
		Equipe_data_base.connection = connection;
	}
	//**********************saveLabo*****************************************************
	
	public static boolean saveEquipe(Equipe equipe){
		boolean set= false;
		try {
		String query1 = "insert into equipe (nom_equipe,ACRO_equipe,id_chercheur,chef_equipe) values(?,?,?,?)";
		PreparedStatement pt1 = connection.prepareStatement(query1);
		pt1.setString(1, equipe.getNom_equipe());
		pt1.setString(2, equipe.getACRO_equipe());
		//pt1.setInt(3, equipe.getId_labo());
		pt1.setInt(3, equipe.getId_chercheur());
		pt1.setString(4, equipe.getChef_equipe());

		pt1.executeUpdate();
		set = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return set ;
	}
	
	public static boolean insertChercheur(Equipe equipe){
		boolean set= false;
		try {
		String query1 = "insert into equipe (id_chercheur) where id_equipe =? values(?,?,?,?)";
		PreparedStatement pt1 = connection.prepareStatement(query1);
		pt1.setString(1, equipe.getNom_equipe());
		pt1.setString(2, equipe.getACRO_equipe());
		pt1.setInt(3, equipe.getId_labo());
		pt1.setInt(4, equipe.getId_chercheur());
		pt1.setString(5, equipe.getChef_equipe());

		pt1.executeUpdate();
		set = true;
		System.out.println("c fait ");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return set ;
	}
	
	
	//************************public  List<Equipe> EquipeParMc(String mc)*******************************
	
		public List<Equipe> EquipeParMc(String mc){
			List<Equipe> listeEquipe = new ArrayList<Equipe>();
			try {
		String query2 = "SELECT * FROM equipe WHERE nom_equipe LIKE ?;";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		pt2.setString(1,"%"+mc+"%");
		ResultSet rs = pt2.executeQuery();
		
		while(rs.next()) {
			Equipe p = new Equipe();
			p.setId_equipe(rs.getInt("id_equipe"));
			p.setNom_equipe(rs.getString("nom_equipe"));
			p.setId_chercheur(rs.getInt("id_chercheur"));
			p.setACRO_equipe(rs.getString("ACRO_equipe"));
			p.setId_labo(rs.getInt("id_labo"));
			p.setChef_equipe(rs.getString("chef_equipe"));
			listeEquipe.add(p);
			System.out.println("c fait ");
						}
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listeEquipe;
			
		
	}
		//***********************liste des equipes*******************
		 public static List<Equipe> ListesEquipes(){
				List<Equipe> ListesEquipes= new ArrayList<Equipe>();
				try {
			String query = "SELECT * FROM equipe ";
			PreparedStatement pt =connection.prepareStatement(query);
			ResultSet r = pt.executeQuery();
			
			while(r.next()) {
				Equipe p = new Equipe();
				p.setId_equipe(r.getInt("id_equipe"));
				p.setNom_equipe(r.getString("nom_equipe"));
				p.setId_chercheur(r.getInt("id_chercheur"));
				p.setACRO_equipe(r.getString("Acro_equipe"));
				p.setId_labo(r.getInt("id_labo"));
				p.setChef_equipe(r.getString("chef_equipe"));
				
		      
				ListesEquipes.add(p);
				System.out.println("c fait ");
							}
					}catch(Exception e) {
			e.printStackTrace();
			}
				return ListesEquipes;
				
			
		}
		 
		 
		
		//********************************set id equipe = null*******************
	  		public static void updateEquipeLabo( int id ,Equipe c)
			{
				try {
					String query3 = "update equipe set id_labo =?  where id_equipe =?";
					PreparedStatement pt3 = connection.prepareStatement(query3);
					
					pt3.setInt(1,c.getId_labo());
					pt3.setInt(2,id);
					pt3.executeUpdate();
				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		//***********************************LaboNom()************* 
				public List<Equipe> EquipeNom(){ 
					List<Equipe> listeDesEquipes = new ArrayList<Equipe>(); 
					try { 
						String query2 = "SELECT * FROM equipe ";
						PreparedStatement pt2 =connection.prepareStatement(query2);
						ResultSet rs = pt2.executeQuery();
			  
						while(rs.next()) {
							Equipe l = new Equipe();
							l.setNom_equipe(rs.getString("nom_equipe")); 
							l.setId_labo(rs.getInt("id_equipe")); 
							listeDesEquipes.add(l);
							System.out.println("c fait "); 
							}
						}catch(Exception e) { 
							e.printStackTrace(); 
							}
			  return listeDesEquipes;
			  
			  
			  }
			 //*********************Equipe Par Nom******************************
				 
			    public static Equipe getNomEquipeParId(int id) {
			    	Equipe c = new Equipe();
					try {
						String query2 = "SELECT nom_equipe from equipe WHERE id_equipe=? ";
						PreparedStatement ps =connection.prepareStatement(query2);
						
						
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						if(rs.next()) {
							c.setId_equipe(id);
							c.setNom_equipe(rs.getString("nom_equipe"));	
						}
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					
					return c;
				}
			    //*********************getEquipe******************************
				 
			    public static Equipe getEquipeParId(int id) {
			    	Equipe c = new Equipe();
					try {
						String query2 = "SELECT * from equipe WHERE id_equipe=? ";
						PreparedStatement ps =connection.prepareStatement(query2);
						
						
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						if(rs.next()) {
							c.setId_equipe(id);
							c.setNom_equipe(rs.getString("nom_equipe"));
							c.setACRO_equipe(rs.getString("ACRO_equipe"));
							c.setId_chercheur(rs.getInt("id_chercheur"));
							c.setId_labo(rs.getInt("id_labo"));
							c.setChef_equipe(rs.getString("chef_equipe"));
						}
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					
					return c;
				}
			    
			  //*********************getEquipe******************************
				 
			    public static chercheur_Model getChercheurParIdEquipe(int id) {
			    	chercheur_Model c = new chercheur_Model();
					try {
						String query2 = "SELECT id_chercheur from equipe WHERE id_equipe=? ";
						PreparedStatement ps =connection.prepareStatement(query2);
						
						
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						if(rs.next()) {
							c.setId_equipe(id);
							
							c.setId_chercheur(rs.getInt("id_chercheur"));
						
						}
					} catch (Exception e) {
						
						e.printStackTrace();
					}
					
					return c;
				}
			    
			  //********************************set id labo = null*******************
		  		public static void updateEquipeLabo( int id )
				{
					try {
						String query3 = "update equipe set id_labo =null  where id_equipe =?";
						PreparedStatement pt3 = connection.prepareStatement(query3);
						
						
						pt3.setInt(1,id);
						pt3.executeUpdate();
						System.out.println("c fait");
					}catch(Exception e) {
						e.printStackTrace();
					}
					
				}
		//***************************update  equipe **************************************************
		public static Equipe updateEquipe( Equipe equipe,int id )
		{
			try {
				String query3 = "update equipe set nom_equipe =?, ACRO_equipe = ? , id_labo = ?, id_chercheur=?,chef_equipe=?   where id_equipe =?";
				PreparedStatement pt3 = connection.prepareStatement(query3);
				
				pt3.setString(1, equipe.getNom_equipe());
				pt3.setString(2, equipe.getACRO_equipe());
		
				pt3.setInt(3, equipe.getId_labo());	
				pt3.setInt(4, equipe.getId_chercheur());
				pt3.setString(5, equipe.getChef_equipe());
				
				
				pt3.setInt(6,id);
				pt3.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return equipe;
		}
		
		
		//********************************Liste des Id Equipe***********************
				public List<Integer> ListeIdEquipe(){
					List<Integer> ListeId = new ArrayList<Integer>();
					try {
				String query2 = "SELECT id_equipe FROM equipe";
				PreparedStatement pt2 =connection.prepareStatement(query2);
				
				ResultSet rs = pt2.executeQuery();
				int id_equipe = 0;
				while(rs.next()) {
					
					
					id_equipe=rs.getInt("id_equipe");
					
					ListeId.add(id_equipe);
					System.out.println("c fait ");
								}
				
				
						}catch(Exception e) {
				e.printStackTrace();
				}
					return ListeId;
					
				
			}
				
		
				
				 //********************chercheur_nom()*******************
			    public List<Equipe> EquipeSansLabo(){
					List<Equipe> EquipeSansLabo = new ArrayList<Equipe>();
					try {
				String query2 = "SELECT * FROM equipe where id_labo is null ";
				PreparedStatement pt2 =connection.prepareStatement(query2);
				ResultSet rs = pt2.executeQuery();
				
				while(rs.next()) {
					Equipe p = new Equipe();
					p.setId_equipe(rs.getInt("id_equipe"));
					p.setNom_equipe(rs.getString("nom_equipe"));
					p.setACRO_equipe(rs.getString("ACRO_equipe"));
					p.setId_chercheur(rs.getInt("id_chercheur"));
					p.setChef_equipe(rs.getString("chef_equipe"));
				
			      
					EquipeSansLabo.add(p);
				
								}
						}catch(Exception e) {
				e.printStackTrace();
				}
					return EquipeSansLabo;
			
			}
		  //*********************Equipe Par Id chercheur ******************************
		
		public static List<Equipe> NomEquipeParIdLabo(int id){
			List<Equipe> listeEquipe = new ArrayList<Equipe>();
			try {
		String query2 = "SELECT id_equipe,nom_equipe from equipe WHERE id_labo = ? ";
		PreparedStatement r =connection.prepareStatement(query2);
		r.setInt(1, id);
		ResultSet rs = r.executeQuery();
		
		while(rs.next()) {
			Equipe p = new Equipe();
			p.setId_labo(id);
			
			p.setId_equipe(rs.getInt("id_equipe"));	
			p.setNom_equipe(rs.getString("nom_equipe"));	
			
			
			listeEquipe.add(p);
						}
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listeEquipe;
			
	}
		
		  public static int getId_equipe() {
		    	int c = 0 ;
				try {	
					String query2 = "SELECT id_equipe from equipe  ";
					PreparedStatement ps =connection.prepareStatement(query2);
					
				
					ResultSet rs=ps.executeQuery();
					if(rs.next()) {
						
						
						c=rs.getInt("id_equipe");
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				return c;
			}

		//***********************************delete equipe******************************************************
		public static void deleteEquipe(int id) {
		try {
			String query4 ="DELETE FROM equipe WHERE id_equipe= ?"; 
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
}
