package Ex0715_problem;

public class NaverMembermMain0715 {

	public static void main(String[] args) {
		System.out.println("按眉 积己 傈");
		NaverMember0715 nvm = new NaverMember0715();
		System.out.println("按眉 积己 饶");
		
		
		nvm.id = "ng001";
		nvm.password = 15251;
		nvm.passwordcheck = 15251;
		nvm.name = "巢泵清";
		nvm.birthday = 19890410;
		nvm.gender = "巢己";
		nvm.email = "naver";
		nvm.phon = "01085540418";
				
		System.out.println(nvm.toString());
		
		NaverMember0715 nvm1 = new NaverMember0715("ng001",15251,15251,"巢泵清",19890410,"巢己","naver","01085540418");
		
		

	}

}
