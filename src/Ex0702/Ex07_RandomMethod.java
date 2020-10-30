package Ex0702;

public class Ex07_RandomMethod {

	public static void main(String[] args) {
		/*
		 * Random 메소드
		 * 특정 범위 내에서 숫자 하나를 출력해주는 메소드
		 *
		 *math = 형변환
		 *
		 */
		//1~10사이의 숫자라나 발생시키기
	
	int num = 0;
	num = (int)(Math.random()*6) + 1;
	
	System.out.println("로또 "+num);
	}

}
