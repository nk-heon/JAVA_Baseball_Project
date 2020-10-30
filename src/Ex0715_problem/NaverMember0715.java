package Ex0715_problem;

public class NaverMember0715 {
		
		String id;
		int password;
		int passwordcheck;
		String name;
		int birthday;
		String gender;
		String email;
		String phon;
		
		NaverMember0715(){
			System.out.println("기본 생성자 호출");
			
		}
		
		public NaverMember0715(String id, int password, int passwordcheck, String name, int birthday, String gender,
				String email, String phon) {
			System.out.println("매개변수 있는 생성자 호출");
			this.id = id;
			this.password = password;
			this.passwordcheck = passwordcheck;
			this.name = name;
			this.birthday = birthday;
			this.gender = gender;
			this.email = email;
			this.phon = phon;
			
		}
		// 메소드(method)
		@Override// @는 어너테이션(Annotation)이라한다.
		//return은 리턴 타입 변수
		public String toString() {
			return "NaverMember [id=" + id + ", password=" + password + ", passwordcheck=" + passwordcheck + ", name="
					+ name + ", birthday=" + birthday + ", gender=" + gender + ", email=" + email + ", phon=" + phon
					+ "]";
		}
		
}
