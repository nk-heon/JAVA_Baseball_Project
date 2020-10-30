package Ex0709;

public class Ex02_Attay {

	public static void main(String[] args) {
		//Array
		//정수형 배열변수 선언
		int[] number;
		int number1[];
		//배열 선언하면서 초기값 지정
		
		int[] number2 = {1,2,3,4};
		//배열에 저장된 데이터 출력
		
		System.out.println(number2[0]);
		System.out.println(number2[1]);
		System.out.println(number2[2]);
		System.out.println(number2[3]);
		//string 타입 배열을 선언하여 같은 줄에 앉은 4명의 이름을 저장하고 출력
		String[] str = {"남궁헌 ","장승한 ","이동영 ","송태환 "};
		
		str[3] = "남궁헌"; // 변경할때 예1)
		
		String n = ""; // 변경할때 예2)
		n = "남궁헌";
		str[1] = n;
		
		System.out.print(str[0]);
		System.out.print(str[1]);
		System.out.print(str[2]);
		System.out.println(str[3]);
		//str 배열의 크기는 4, 마지막 인덱스는 3
		//배열의 크기 값 활용하기
		
		System.out.println(str.length);
		//for문을 이용하여 배열에 저장된 값 모두 출력하기
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		int[] number3;
		number3 = new int[3];
		int[] number4 = new int[3];
		
		//number4에 공간을 만들어 준다.
		//공간의 값은 없다.
		System.out.println(number4.length);
		for(int i = 0; i<number4.length; i++) {
			System.out.println(number4[i]);
		}
		
		number3[0] = 1;
		
	}

}
