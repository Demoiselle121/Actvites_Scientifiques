package metier.entites;

public class AdminLogin {
private int id_user;
private String user;
private String username;
private String password;
private String role;
public AdminLogin() {
	super();
}
public AdminLogin(int id_user, String user, String username, String password, String role) {
	super();
	this.id_user = id_user;
	this.user = user;
	this.username = username;
	this.password = password;
	this.role = role;
}

public AdminLogin(String user, String username, String password, String role) {
	super();
	
	this.user = user;
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
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
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
@Override
public String toString() {
	return "AdminLogin [id_user=" + id_user + ", user=" + user + ", username=" + username + ", password=" + password
			+ ", role=" + role + "]";
}

}
