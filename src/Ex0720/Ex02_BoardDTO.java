package Ex0720;

public class Ex02_BoardDTO {
	
	//필드
	String bulletinboard;
	String anonymity;
	String password;
	
	//get,set 메소드 
	public String getBulletinboard() {
		return bulletinboard;
	}
	public void setBulletinboard(String bulletinboard) {
		this.bulletinboard = bulletinboard;
	}
	public String getAnonymity() {
		return anonymity;
	}
	public void setAnonymity(String anonymity) {
		this.anonymity = anonymity;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//기본 생성자
	public Ex02_BoardDTO() {
	}
	
	//toString
	@Override
	public String toString() {
		return "Ex02_BoardDTO [bulletinboard=" + bulletinboard + ", anonymity=" + anonymity + ", password=" + password
				+ "]";
	}
	
	
	
	
}
