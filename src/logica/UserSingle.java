package logica;

public class UserSingle {
	private User user;
	public static UserSingle usuario;
	
	private UserSingle(){
		this.user=null;
	}
	
	public static UserSingle getUserSingle(){
		if(usuario==null)
		{
			usuario = new UserSingle(); 
		}
		return usuario;
	}
	
	public void setUser(User u){
		this.user=u;
	}
	
	public User getUser(){
		return this.user;
	}
}
