package pojo_model;

/**
 * This POJO (Plain Old Java Object), or model object, is used to store user details.
 * 
 * @author Karawalaya - Isuru Samarasekara
 * @since 2019-05-17
 */
public class User {
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
}
