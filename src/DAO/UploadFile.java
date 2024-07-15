package DAO;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UploadFile {
	public void addFile(String name, String gender, String email, String password, String adress, byte[] bytes) throws FileNotFoundException {

			
	System.out.println("Add File function");
			Connection conn = SingletonConnection.getConnection();
			try {
				PreparedStatement ps = conn.prepareStatement("insert into profile(nameP,genderP,emailP,passwordP,adressP,fileP) values(?,?,?,?,?,?)");
			
			    int success =0;
				ps.setString(1, name);
				ps.setString(2,gender);
				ps.setString(3, email);
				ps.setString(4,password);
				ps.setString(5, adress);
				ps.setBytes(6, bytes);
				success = ps.executeUpdate();
				if(success == 1) {
					System.out.println("File is stored");
					ps.close();
				}
				
				
				
			} catch (SQLException e1 ) {
				
				e1.printStackTrace();
			}		
		

			

		
		}
		
		public byte[] getFile(int id) {
			
			Connection conn = SingletonConnection.getConnection();
			 ResultSet rset=null;
			 byte[] bytes=null;
			PreparedStatement ps;
			try {
				ps = conn.prepareStatement("Select fileP from profile where idP=?");
				ps.setInt(1, id);
		        rset = ps.executeQuery();
		        if (rset.next()) {
		        	bytes =  rset.getBytes("fileP");
		        	
		        	}
		        else return null;
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	        
			return bytes;  
		}

	}


