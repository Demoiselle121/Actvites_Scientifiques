package DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import metier.entites.AdminLogin;


public class Admin_login_data_base {
	//String roleAdmin = null;
	
	
	private String userName = null; 
	private String passWord = null;
	private String roleAdmin = null;
	
	public  boolean validate(AdminLogin login) throws Exception {
        boolean status = false;
        try {
        	
        
			
        	
        	
        	
	            PreparedStatement preparedStatement = SingletonConnection.getConnection().prepareStatement("select * from admin where username = ? and password = ?");
	        	
	            preparedStatement.setString(1, login.getUsername());
	            preparedStatement.setString(2, login.getPassword());
	            //preparedStatement.setString(3, login.getRole());

	            ResultSet rs = preparedStatement.executeQuery();
	            
	            while(rs.next()){
	            	status = true;
	            	System.out.println("test");
	            	userName = rs.getString("username");
	            	passWord = rs.getString("password");
	            	roleAdmin = rs.getString("role");
	            	System.out.println("role : " + roleAdmin);
	            }
	            
	           // System.out.println("role:"+login.getRole());
	        } catch (SQLException e) {
	            printSQLException(e);
	        } 
        	
	        return status;
	       
	    }

	    static void printSQLException(SQLException ex) {
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

		public String getRoleAdmin() {
			return roleAdmin;
		}
	    
	    
	}
		 
			
		
		



