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
			System.out.println("�⺻ ������ ȣ��");
			
		}
		
		public NaverMember0715(String id, int password, int passwordcheck, String name, int birthday, String gender,
				String email, String phon) {
			System.out.println("�Ű����� �ִ� ������ ȣ��");
			this.id = id;
			this.password = password;
			this.passwordcheck = passwordcheck;
			this.name = name;
			this.birthday = birthday;
			this.gender = gender;
			this.email = email;
			this.phon = phon;
			
		}
		// �޼ҵ�(method)
		@Override// @�� ������̼�(Annotation)�̶��Ѵ�.
		//return�� ���� Ÿ�� ����
		public String toString() {
			return "NaverMember [id=" + id + ", password=" + password + ", passwordcheck=" + passwordcheck + ", name="
					+ name + ", birthday=" + birthday + ", gender=" + gender + ", email=" + email + ", phon=" + phon
					+ "]";
		}
		
}
