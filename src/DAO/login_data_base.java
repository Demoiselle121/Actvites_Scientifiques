package DAO;
import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

import metier.entites.chercheur_Model;
import metier.entites.login;

public class login_data_base {
	public static boolean validate(chercheur_Model login) throws ClassNotFoundException {
        boolean status = false;
        try {
	            PreparedStatement preparedStatement = SingletonConnection.getConnection().prepareStatement("select * from chercheur where nom_chercheur = ? and mdp = ? ");
	        	
	            preparedStatement.setString(1, login.getNom_chercheur());
	            preparedStatement.setString(2, login.getMdp());

	            System.out.println(preparedStatement);
	            ResultSet rs = preparedStatement.executeQuery();
	          
	            status = rs.next();

	        } catch (SQLException e) {
	            
	            printSQLException(e);
	            System.out.println(" erreur");
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
	    
	    
	  
	    }
	
