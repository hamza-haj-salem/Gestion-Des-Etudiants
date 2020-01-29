package model1;

public class user {
	String login ;
	String mp ;
	public user(String login, String mp) {
		super();
		this.login = login;
		this.mp = mp;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMp() {
		return mp;
	}
	public void setMp(String mp) {
		this.mp = mp;
	}
	@Override
	public String toString() {
		return "user [login=" + login + ", mp=" + mp + "]";
	}
	
	
	
	

}
