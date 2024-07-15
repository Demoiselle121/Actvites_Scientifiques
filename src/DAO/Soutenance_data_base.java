package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entites.Conference;
import metier.entites.Publication;
import metier.entites.Soutenance;



public class Soutenance_data_base {
static Connection connection;
	
	public Soutenance_data_base(Connection connection ) {
		Soutenance_data_base.connection = connection;
	}
	//**********************Soutenance*****************************************************
	
	public static boolean saveSoutenance(Soutenance soutenance){
		boolean set= false;
		try {
		String query1 = "insert into soutenance (type_soutenance,intitule_soutenance,justificatif_soutenance,lieu_soutenance,id_chercheur,date_soutenance,pdfSout) values(?,?,?,?,?,?,?)";
		PreparedStatement pt1 = connection.prepareStatement(query1);
		pt1.setString(1, soutenance.getType_soutenance());
		pt1.setString(2, soutenance.getIntitule_soutenance());
		pt1.setBytes(3, soutenance.getJustificatif_soutenance());
		pt1.setString(4, soutenance.getLieu_soutenance());
		pt1.setInt(5, soutenance.getId_chercheur());
		pt1.setDate(6, soutenance.getDate_soutenance());
		pt1.setBytes(7, soutenance.getPdfSout());

		pt1.executeUpdate();
		set = true;
		System.out.println("c fait ");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return set ;
	}
	
//////////////////////////////////////justifiacti_Sout(id)/////////////////////////////////
public static byte[] getJustifiactif_Sout_sout(int id_soutenance){
byte[] justif = null ;
try {	
String query2 = "SELECT justificatif_soutenance from soutenance WHERE id_soutenance=? ";
PreparedStatement ps =connection.prepareStatement(query2);

ps.setInt(1,id_soutenance);

ResultSet rs=ps.executeQuery();
if(rs.next()) {


justif = rs.getBytes("justificatif_soutenance");	


}

} catch (Exception e) {

e.printStackTrace();
}
return justif;


}

//////////////////////////////////////justifiacti_Sout(id)/////////////////////////////////
public static byte[] getSout(int id_soutenance){
byte[] justif = null ;
try {	
String query2 = "SELECT pdfSout from soutenance WHERE id_soutenance=? ";
PreparedStatement ps =connection.prepareStatement(query2);

ps.setInt(1,id_soutenance);

ResultSet rs=ps.executeQuery();
if(rs.next()) {


justif = rs.getBytes("pdfSout");	


}

} catch (Exception e) {

e.printStackTrace();
}
return justif;


}
	//************************public  List<Soutenance> soutParIdChercheur*******************************
	
			public static List<Soutenance> soutParIdChercheur(int id){
				List<Soutenance> listeSout = new ArrayList<Soutenance>();
				try {
			String query2 = "SELECT * FROM soutenance WHERE id_chercheur = ?;";
			PreparedStatement pt2 =connection.prepareStatement(query2);
			pt2.setInt(1,id);
			ResultSet rs = pt2.executeQuery();
			
			while(rs.next()) {
				Soutenance p = new Soutenance();
				p.setId_soutenance(rs.getInt("id_soutenance"));
				p.setType_soutenance(rs.getString("type_soutenance"));
				p.setIntitule_soutenance(rs.getString("intitule_soutenance"));
				p.setJustificatif_soutenance(rs.getBytes("Justificatif_soutenance"));
				p.setLieu_soutenance(rs.getString("lieu_soutenance"));
				p.setId_chercheur(rs.getInt("id_chercheur"));
				p.setDate_soutenance(rs.getDate("date_soutenance"));
				p.setPdfSout(rs.getBytes("pdfSout"));
				listeSout.add(p);
				System.out.println("c fait ");
							}
			
			
					}catch(Exception e) {
			e.printStackTrace();
			}
				return listeSout;
				
			
		}
	//************************public  List<Equipe> 	SoutenanceParMc(String mc)*******************************
	
		public List<Soutenance> SoutenanceParMc(String mc){
			List<Soutenance> listeEquipe = new ArrayList<Soutenance>();
			try {
		String query2 = "SELECT * FROM soutenance WHERE type_soutenance LIKE ?;";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		pt2.setString(1,"%"+mc+"%");
		ResultSet rs = pt2.executeQuery();
		
		while(rs.next()) {
			Soutenance s = new Soutenance();
			s.setType_soutenance(rs.getString("type_soutenance"));
			s.setIntitule_soutenance(rs.getString("intitule_soutenance"));
			s.setJustificatif_soutenance(rs.getBytes("justificatif_soutenance"));
			s.setLieu_soutenance(rs.getString("lieu_soutenance"));
			s.setId_chercheur(rs.getInt("id_chercheur"));
			s.setDate_soutenance(rs.getDate("date_soutenance"));
			s.setPdfSout(rs.getBytes("pdfSout"));
			listeEquipe.add(s);
			System.out.println("c fait ");
						}
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listeEquipe;
			
		
	}
		//*******************************liste des souteances***********************************
		public static List<Soutenance> ListesSoutenances(){
			List<Soutenance> ListesSoutenances= new ArrayList<Soutenance>();
			try {
		String query = "SELECT * FROM soutenance ";
		PreparedStatement pt =connection.prepareStatement(query);
		ResultSet r = pt.executeQuery();
		
		while(r.next()) {
			Soutenance p = new Soutenance();
			p.setId_soutenance(r.getInt("id_soutenance"));
			p.setType_soutenance(r.getString("type_soutenance"));
			p.setIntitule_soutenance(r.getString("intitule_soutenance"));
			p.setJustificatif_soutenance(r.getBytes("justificatif_soutenance"));
			p.setLieu_soutenance(r.getString("lieu_soutenance"));
			p.setId_chercheur(r.getInt("id_chercheur"));
			p.setDate_soutenance(r.getDate("date_soutenance"));
			p.setPdfSout(r.getBytes("pdfSout"));
	      
			ListesSoutenances.add(p);
			System.out.println("c fait ");
						}
				}catch(Exception e) {
		e.printStackTrace();
		}
			return ListesSoutenances;
			
		
	}
		//========================================================================================
		public List<String> SoutenanceParType(){
			List<String> listeSoutParType = new ArrayList<String>();
			try {
		String query2 = "SELECT * FROM soutenance";
		PreparedStatement pt2 =connection.prepareStatement(query2);
		
		ResultSet rs = pt2.executeQuery();
		String SoutType = null;
		while(rs.next()) {
			 SoutType =  rs.getString("type_soutenance");
			 listeSoutParType.add(SoutType);
			System.out.println("c fait ");
						}
		
		
				}catch(Exception e) {
		e.printStackTrace();
		}
			return listeSoutParType;
			
		
	}
		//========================================================================================
				public List<String> SoutenanceParIntitule(){
					List<String> listeSoutParInti = new ArrayList<String>();
					try {
				String query2 = "SELECT * FROM soutenance";
				PreparedStatement pt2 =connection.prepareStatement(query2);
				
				ResultSet rs = pt2.executeQuery();
				String SoutInti = null;
				while(rs.next()) {
					SoutInti =  rs.getString("intitule_soutenance");
					 listeSoutParInti.add(SoutInti);
					System.out.println("c fait ");
								}
				
				
						}catch(Exception e) {
				e.printStackTrace();
				}
					return listeSoutParInti;
					
				
			}
		//***************************update  soutenance **************************************************
		public Soutenance updateSoutenance( Soutenance sout,int id )
		{
			try {
				String query3 = "update soutenance set type_soutenance =?,intitule_soutenance= ?, justificatif_soutenance=? , lieu_soutenance=?, id_chercheur=?,pdfSout =?  where id_soutenance=?";
				PreparedStatement pt3 = connection.prepareStatement(query3);
				
				pt3.setString(1, sout.getType_soutenance());
				pt3.setString(2, sout.getIntitule_soutenance());
				pt3.setBytes(3, sout.getJustificatif_soutenance());
				pt3.setString(4, sout.getLieu_soutenance());
				pt3.setInt(5, sout.getId_chercheur());
				pt3.setDate(6, sout.getDate_soutenance());
				pt3.setBytes(7, sout.getPdfSout());
				pt3.setInt(8,id);
				pt3.executeUpdate();
				System.out.println("c fait");
			}catch(Exception e) {
				e.printStackTrace();
			}
			return sout;
		}
		//***********************************delete Soutenance******************************************************
		public static void deleteSoutenance(int id) {
		try {
			String query4 ="DELETE FROM soutenance WHERE id_soutenance= ?"; 
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
