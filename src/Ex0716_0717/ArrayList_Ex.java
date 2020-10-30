package Ex0716_0717;

import java.util.*;

public class ArrayList_Ex {

	public static void main(String[] args) {
		/*
		 * ArrayList, Set, Map
		 */
		//list 라는 이름의 ArrayList 선언
		List<Integer> numbers = new ArrayList<Integer>();
		//<> : generic
		// 타입변환을 하지 않고도 해당 타입을 사용할 수 있게해줌
		List<String> strs = new ArrayList<String>();
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		// numbers에 값 저장
		numbers.add(10);
		int num = 100;
		numbers.add(num);
		System.out.println(numbers.add(500));
		// 추가하면 기존에 있던 값이 앞으로 당겨져서 그자리에 추가됨.
		numbers.add(1, 99);
		numbers.add(1, 999);
		//전체 데이터 삭제
//		numbers.clear();
		// 추가하면 기존에 있던 값이 지워져서 뒤로 당겨짐.
		numbers.remove(2);
		// 출력
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		//ArrayList크기 출력
		System.out.println(numbers.size());
		//for.문을 이용하여 ArrayList에 담긴 모든 데이터 출력
		
		for(int i = 0;i<numbers.size();i++) {
			System.out.println("인덱스"+i+" : "+numbers.get(i));
		}
		
		strs.add("가");
		List<StudentDTO> stuList1 = new ArrayList<StudentDTO>();
		StudentDTO stu = new StudentDTO();
		stu.setName("회원1");
		stu.setAddress("인천광역시");
		stu.setPhone("010-1111-1111");
		
		stuList1.add(stu);
		System.out.println(stuList1.get(0));
		System.out.println(stuList1.get(0).getName());
		System.out.println(stuList1.get(0).getAddress());
		System.out.println(stuList1.get(0).getPhone());
		
		StudentDTO stu1 = new StudentDTO();
		stu1.setName("회원2");
		stu1.setAddress("부천시");
		stu1.setPhone("010-2222-22222");
		
		stuList1.add(stu1);
		System.out.println(stuList1.get(1).getName());
		System.out.println(stuList1.get(1).getAddress());
		System.out.println(stuList1.get(1).getPhone());
		
		for(int i=0;i<stuList1.size();i++) {
			System.out.println("전체 출력 : "+stuList1.get(i));
			System.out.println("이름만 출력 : "+stuList1.get(i).getName());
		}
	}

}
