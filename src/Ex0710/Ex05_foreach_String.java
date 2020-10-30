package Ex0710;

public class Ex05_foreach_String {

	public static void main(String[] args) {
		//값이 5개 있는 String배열을 선언하고
		//foreach를 이용하여 배열에 저장된 값을 모두 출력
		String[] str = {"1","2","3"};
		
		for(String A:str) {
			System.out.println(A);
		}
	}

}
