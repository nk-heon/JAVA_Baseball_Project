package ex0629;

public class ex04_string {

	public static void main(String[] args) {
		//문자열
		//변수.equals("문자")는 문자열에  true , false 를 비교할 수있다.
		String strVar1 = "";
		String strVar2 = null;
		
		strVar1 = "아무내용이나 다 들어갑니다. :12223asjkdd";
		strVar2 = "sad";
		System.out.println(strVar1);
		System.out.println(strVar2);
		
		String strVar3 = "";
		String strVar4 = "";
		String strVar5 = "";
		String result = "";
		
		strVar3 = "자바";
		strVar4 = "할만하네요 : ";
		strVar5 = "재미있네요 : ";
		
		result = strVar3 + strVar4;
		System.out.println(result + (10 + 20 + 10 - 3));
		
		result = strVar3 + strVar5;
		System.out.println(result + 10 * 2);
		
		result = strVar4 + strVar5;
		System.out.println(result);

		
	}
}
