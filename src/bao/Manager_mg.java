package bao;

public class Manager_mg {
	
//Ã¿Ò³¼ÇÂ¼Êı
	public static final int PAGE_SIZE = 8;
//id
	private int id;
//ÕËºÅ
	private String username;
//ÃÜÂë 
	private String password;
 	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
}
