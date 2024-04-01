package entity;

public class Admin {

	private int id;
	private String username, email, password;
	//private byte img;

	public Admin(int id, String username, String email, String password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		//this.img = img;
	}

	public Admin(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		//this.img = img;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}




	}


