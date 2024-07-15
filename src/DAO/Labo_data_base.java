package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entites.Equipe;
import metier.entites.Labo;
import metier.entites.Publication;


public class Labo_data_base {
static Connection connection;
	
	public Labo_data_base(Connection connection ) {
		Labo_data_base.connection = connection;
	}
	//**********************saveLabo*****************************************************
	
	public static boolean saveLab(Labo labo){
		boolean set= false;
		try {
		String query1 = "insert into labo (nom_labo) values(?)";
		PreparedStatement pt1 = connection.prepareStatement(query1);
		pt1.setString(1, labo.getNom_labo());
		pt1.executeUpdate();
		set = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return set ;
	}
	//************************public List<Labo> LaboParMc(String mc)*******************************
	
		public static List<Labo> LaboParMc(String mc){
			List<Labo> listeLabo = new ArrayList<Labo>();
			try {
		String query2 = "SELECT * FROM labo WHERE nom_labo LIKE ?;";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		pt2.setString(1,"%"+mc+"%");
		ResultSet rs = pt2.executeQuery();
		
		while(rs.next()) {
			Labo p = new Labo();
		
			p.setId_labo(rs.getInt("id_labo"));	
			p.setNom_labo(rs.getString("nom_labo"));
			
			
			listeLabo.add(p);
			System.out.println("c fait ");
						}
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listeLabo;
			
		
	}

	
	  //***********************************LaboNom()************* 
		public List<Labo> LaboNom(){ 
			List<Labo> listeDesLabo = new ArrayList<Labo>(); 
			try { 
				String query2 = "SELECT * FROM labo ";
				PreparedStatement pt2 =connection.prepareStatement(query2);
				ResultSet rs = pt2.executeQuery();
	  
				while(rs.next()) {
					Labo l = new Labo();
					l.setNom_labo(rs.getString("nom_labo")); 
					l.setId_labo(rs.getInt("id_labo")); 
					listeDesLabo.add(l);
					System.out.println("c fait "); 
					}
				}catch(Exception e) { 
					e.printStackTrace(); 
					}
	  return listeDesLabo;
	  
	  
	  }
		 //*********************getLaboParId******************************
		 
	    public static Labo getLaboParId(int id) {
	    	Labo c = new Labo();
			try {
				String query2 = "SELECT * from labo WHERE id_labo=? ";
				PreparedStatement ps =connection.prepareStatement(query2);
				
				
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				if(rs.next()) {
					c.setId_labo(id);
					c.setNom_labo(rs.getString("nom_labo"));					
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return c;
	    }
	 
		//***************************update Labo **************************************************
		public static Labo updateLabo(Labo labo,int id )
		{
			try {
				String query3 = "update labo set nom_labo =? where id_labo =?";
				PreparedStatement pt3 = connection.prepareStatement(query3);
				
				pt3.setString(1, labo.getNom_labo());
				pt3.setInt(2,id);
				pt3.executeUpdate();
				System.out.println("c fait");
			}catch(Exception e) {
				e.printStackTrace();
			}
			return labo;
		}
		///////////////////////////////////////////////////////////////////
		  public static int getId_labo() {
		    	int c = 0 ;
				try {	
					String query2 = "SELECT id_labo from labo ";
					PreparedStatement ps =connection.prepareStatement(query2);
					
				
					ResultSet rs=ps.executeQuery();
					if(rs.next()) {
						
						
						c=rs.getInt("id_labo");
					}
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				return c;
			}
		//***********************************delete labo******************************************************
		public static void deleteLabo(int id) {
		try {
			String query4 ="DELETE FROM labo WHERE id_labo = ?"; 
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
