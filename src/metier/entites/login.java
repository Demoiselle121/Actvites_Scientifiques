package metier.entites;

import java.io.Serializable;

public class login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id_user;
	private String username;
	private String password;
	private String role ;
	
	
	
	public login() {
		super();
		
	}



	public login(int id_user, String username, String password, String role) {
		super();
		this.id_user = id_user;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public login( String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}



	



	public int getId_user() {
		return id_user;
	}



	public void setId_user(int id_user) {
		this.id_user = id_user;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public String toString() {
		return "login [id_user=" + id_user + ", username=" + username + ", password=" + password + ", role=" + role
				+ "]";
	}
	
	
	
}
