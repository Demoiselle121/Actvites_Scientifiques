package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entites.Conference;
import metier.entites.Encadrement;


public class Encadrement_data_base {
static Connection connection;
	
	public Encadrement_data_base(Connection connection ) {
		Encadrement_data_base.connection = connection;
	}
	//**********************Encadrement*****************************************************
	
	public static boolean saveEncadrement(Encadrement encadrement){
		boolean set= false;
		try {
		String query1 = "insert into encadrement (type_encadrement,intitule_encadrement,niveau_encadrement,justificatif,id_chercheur,date_encadrement,pdfEncadr,encadrement) values(?,?,?,?,?,?,?,?)";
		PreparedStatement pt1 = connection.prepareStatement(query1);
		pt1.setString(1, encadrement.getType_encadrement());
		pt1.setString(2, encadrement.getIntitule_encadrement());
		
		pt1.setString(3, encadrement.getNiveau_encadrement());
		
		pt1.setBytes(4, encadrement.getJustificatif());
		pt1.setInt(5, encadrement.getId_chercheur());
		pt1.setDate(6, encadrement.getDate_encadrement());
		pt1.setBytes(7, encadrement.getPdfEncadre());
		pt1.setString(8, encadrement.getEncadrement());
		

		pt1.executeUpdate();
		set = true;
		System.out.println("c fait ");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return set ;
	}
	//************************public  List<Encadrement> EncadrementParMc(String mc)*******************************
	
		public List<Encadrement> EncadrementParMc(String mc){
			List<Encadrement> listeEncadremnent = new ArrayList<Encadrement>();
			try {
		String query2 = "SELECT * FROM encadrement WHERE type_encadrement LIKE ?;";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		pt2.setString(1,"%"+mc+"%");
		ResultSet rs = pt2.executeQuery();
		
		while(rs.next()) {
			Encadrement s = new Encadrement();
			s.setType_encadrement(rs.getString("type_encadrement"));
			s.setIntitule_encadrement(rs.getString("intitule_encadrement"));
			s.setNiveau_encadrement(rs.getString("niveau_encadrement"));
			
			s.setJustificatif(rs.getBytes("justificatif"));
			s.setId_chercheur(rs.getInt("id_chercheur"));
			s.setDate_encadrement(rs.getDate("date_encadrement"));
			s.setEncadrement(rs.getString("encadrement"));
			listeEncadremnent.add(s);
			System.out.println("c fait ");
						}
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listeEncadremnent;
			
		
	}
		
//////////////////////////////////////justifiacti_pub(id)/////////////////////////////////
public static byte[] getJustificatif_Encad_encad(int id_encadrement){
byte[] justif = null ;
try {	
String query2 = "SELECT justificatif from encadrement WHERE id_encadrement=? ";
PreparedStatement ps =connection.prepareStatement(query2);

ps.setInt(1,id_encadrement);

ResultSet rs=ps.executeQuery();
if(rs.next()) {


justif = rs.getBytes("justificatif");	


}

} catch (Exception e) {

e.printStackTrace();
}
return justif;


}

//////////////////////////////////////justifiacti_pub(id)/////////////////////////////////
public static byte[] getEncad(int id_encadrement){
byte[] justif = null ;
try {	
String query2 = "SELECT pdfEncadr from encadrement WHERE id_encadrement=? ";
PreparedStatement ps =connection.prepareStatement(query2);

ps.setInt(1,id_encadrement);

ResultSet rs=ps.executeQuery();
if(rs.next()) {


justif = rs.getBytes("pdfEncadr");	


}

} catch (Exception e) {

e.printStackTrace();
}
return justif;


}
		//************************public  List<Encadrement> EncadrementParNiveua(String mc)*******************************
		
			public List<String> EncadrementParNiveau(){
				List<String> listeNiveauEncadremnent = new ArrayList<String>();
				try {
			String query2 = "SELECT * FROM encadrement  ";
			PreparedStatement pt2 =connection.prepareStatement(query2);
			String niveau_encadrement = null;
			ResultSet rs = pt2.executeQuery();
			
			while(rs.next()) {
				
				
				niveau_encadrement = rs.getString("niveau_encadrement");
				 System.out.println("niveauEndrement ! " + niveau_encadrement);
				 listeNiveauEncadremnent.add(niveau_encadrement);
				System.out.println("c fait ");
							}
					}catch(Exception e) {
			e.printStackTrace();
			}
				return listeNiveauEncadremnent;
				
			
		}
			//************************public  List<Encadrement> EncadrementParNiveua(String mc)*******************************
			
			public List<String> Encadrement(){
				List<String> Encadremnent = new ArrayList<String>();
				try {
			String query2 = "SELECT * FROM encadrement  ";
			PreparedStatement pt2 =connection.prepareStatement(query2);
			String encadrement = null;
			ResultSet rs = pt2.executeQuery();
			
			while(rs.next()) {
				
				
				encadrement = rs.getString("encadrement");
				Encadremnent.add(encadrement);
							}
					}catch(Exception e) {
			e.printStackTrace();
			}
				return Encadremnent;
				
			
		}
		//************************public  List<Encadrement> EncadrementParMc(String mc)*******************************
		
			public List<String> EncadrementParType(){
				System.out.println("Encadrement Par type !!! ");
				List<String> listeTypeEncadremnent = new ArrayList<String>();
				try {
			String query2 = "SELECT * FROM encadrement ";
			PreparedStatement pt2 =connection.prepareStatement(query2);
			String typeEndrement = null;
			
			ResultSet rs = pt2.executeQuery();
			
			while(rs.next()) {
				
				
				typeEndrement= rs.getString("type_encadrement");
			    System.out.println("typeEndrement ! " + typeEndrement);
			    listeTypeEncadremnent.add(typeEndrement);
				System.out.println("c fait ");
							}
					}catch(Exception e) {
			e.printStackTrace();
			}
				return listeTypeEncadremnent;
				
			
		}
			//************************************liste des encadr**********************************************************
			 public List<Encadrement> ListesEncadrements(){
					List<Encadrement> ListesEncadrements = new ArrayList<Encadrement>();
					try {
				String query = "SELECT * FROM encadrement ";
				PreparedStatement pt =connection.prepareStatement(query);
				ResultSet r = pt.executeQuery();
				
				while(r.next()) {
					Encadrement p = new Encadrement();
					p.setId_encadrement(r.getInt("id_encadrement"));
					p.setType_encadrement(r.getString("type_encadrement"));
					p.setIntitule_encadrement(r.getString("intitule_encadrement"));
					p.setNiveau_encadrement(r.getString("niveau_encadrement"));
					p.setJustificatif(r.getBytes("justificatif"));
					
					p.setId_chercheur(r.getInt("id_chercheur"));
					p.setDate_encadrement(r.getDate("date_encadrement"));
					p.setEncadrement(r.getString("encadrement"));
					
			      
					ListesEncadrements.add(p);
					System.out.println("c fait ");
								}
						}catch(Exception e) {
				e.printStackTrace();
				}
					return ListesEncadrements;
					
				
			}
			//************************public  List<strnig> EncadrementParIntitule()*******************************
			
			public List<String> EncadrementParIntitule(){
				
				List<String> listeIntitule = new ArrayList<String>();
				
				try {
			String query2 = "SELECT * FROM encadrement ";
			PreparedStatement pt2 =connection.prepareStatement(query2);
			String intitule_encadrement = null;
			ResultSet rs = pt2.executeQuery();
			
			while(rs.next()) {
				
				intitule_encadrement = rs.getString("intitule_encadrement");
				System.out.println(intitule_encadrement);
				
				listeIntitule.add(intitule_encadrement);
				System.out.println("c fait ");
							}
					}catch(Exception e) {
			e.printStackTrace();
			}
				return listeIntitule;
		}
		//***************************update  Encadrement **************************************************
		public Encadrement updateEncadrement( Encadrement sout,int id )
		{
			try {
				String query3 = "update encadrement set type_encadrement =?,intitule_encadrement= ?, niveau_encadrement=? , justificatif=?,id_chercheur=?,date_soutenance=?, encadrement = ?  where id_encadrement=?";
				PreparedStatement pt3 = connection.prepareStatement(query3);
				
				pt3.setString(1, sout.getType_encadrement());
				pt3.setString(2, sout.getIntitule_encadrement());
				pt3.setString(3, sout.getNiveau_encadrement());
				
				pt3.setBytes(5, sout.getJustificatif());
				pt3.setInt(6, sout.getId_chercheur());
				pt3.setDate(7, sout.getDate_encadrement());
				pt3.setString(8, sout.getEncadrement());
				pt3.setInt(9,id);
				pt3.executeUpdate();
				System.out.println("c fait");
			}catch(Exception e) {
				e.printStackTrace();
			}
			return sout;
		}
		//***********************************delete Encadrement******************************************************
		public static void deleteEncadrement(int id) {
		try {
			String query4 ="DELETE FROM encadrement WHERE id_encadrement= ?"; 
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
